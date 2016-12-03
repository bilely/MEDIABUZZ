package com.humanbooster.mediabuzz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.humanbooster.mediabuzz.business.Publication;
import com.humanbooster.mediabuzz.business.Utilisateur;
import com.humanbooster.mediabuzz.dao.PublicationDaoInterface;
import com.humanbooster.mediabuzz.utils.Consts;
import com.humanbooster.mediabuzz.utils.DateManager;

public class PublicationDaoImpl implements PublicationDaoInterface {

	private Connection connection;
	private static Logger logger = Logger.getLogger(PublicationDaoImpl.class);
	private UtilisateurDaoImpl uDaoImpl;
	// ------------------------ Constructeur --------------------------

	public PublicationDaoImpl(Connection connection) {
		this.connection = connection;
		String log4jConfPath = Consts.LOG4J_CONF_PATH;
		PropertyConfigurator.configure(log4jConfPath);
		uDaoImpl = new UtilisateurDaoImpl(connection);
	}

	// --------------------- Méthode createPublication -----------------

	@Override
	public boolean createPublication(Publication publication) {
		boolean isCreated = false;
		System.out.println(publication.getAuteur().getId());
		try {
			PreparedStatement ps = connection
					.prepareStatement(Consts.CREATE_PUBLICATION_QUERY);
			ps.setString(1, publication.getAuteur().getNom());
			ps.setTimestamp(2, DateManager.convertDateToSqlDateStamp(
					publication.getDatePublication()));
			ps.setString(3, publication.getTitre());
			ps.setInt(4, publication.getAuteur().getId());
			ps.execute();
			isCreated = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isCreated;
	}

	// ------------------------ Méthode getPublication -----------------

	@Override
	public Publication getPublication(int id) {
		Publication publication = null;
		try {
			PreparedStatement ps = connection
					.prepareStatement(Consts.GET_ONE_PUBLICATION);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Utilisateur temp = uDaoImpl.getUser(rs.getString(2));
				publication = new Publication(id, temp,
						DateManager.convertSqlTimeStampToUtilDate(
								rs.getTimestamp(3)),
						rs.getString(4), rs.getInt(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return publication;
	}

	// --------------------- Méthode getAllPublication ---------------

	@Override
	public List<Publication> getAllPublication(Utilisateur utilisateur) {

		logger.info(utilisateur);
		List<Publication> publications = new ArrayList<>();
		try {
			PreparedStatement ps = connection
					.prepareStatement(Consts.GET_ALL_PUBLICATION_TO_ONE_QUERY);
			ps.setString(1, utilisateur.getNom());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Publication publication = new Publication(rs.getInt(1),
						utilisateur,
						DateManager.convertSqlTimeStampToUtilDate(
								rs.getTimestamp(3)),
						rs.getString(4), rs.getInt(5));
				publications.add(publication);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return publications;
	}

	// ------------------------ Méthode insertAllPublication -----------

	@Override
	public boolean insertAllPublication(List<Publication> publications) {
		boolean insertAll = false;
		Iterator<Publication> i = publications.iterator();
		try {
			while (i.hasNext()) {

				PreparedStatement ps = connection
						.prepareStatement(Consts.CREATE_PUBLICATION_QUERY);

				Publication publication = i.next();
				ps.setString(1, publication.getAuteur().getNom());
				ps.setTimestamp(2,
						DateManager.convertDateToSqlDateStamp(
								publication.getDatePublication()));
				ps.setString(3, publication.getTitre());
				ps.setInt(4, publication.getAuteur().getId());
				ps.executeUpdate();
			}
			insertAll = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return insertAll;
	}

	// ------------------------ Méthode updatePublication ---------------

	@Override
	public boolean updatePublication(Publication publication) {
		boolean isUpdated = false;
		try {
			PreparedStatement ps = connection
					.prepareStatement(Consts.UPDATE_PUBLICATION_QUERY);
			ps.setInt(1, publication.getId());
			ps.executeUpdate();
			isUpdated = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isUpdated;
	}

	// ---------------------- Méthode nbPublication --------------

	@Override
	public int nbPublication(Utilisateur utilisateur) {
		int nbPublication = -1;
		try {
			PreparedStatement ps = connection
					.prepareStatement(Consts.COUNT_PUBLICATION_TO_QUERY);
			ps.setInt(1, utilisateur.getId());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				nbPublication = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nbPublication;
	}

	// ---------------------- Méthode deletePublication --------------

	@Override
	public boolean deletePublication(int id) {
		boolean isDeleted = false;
		try {
			PreparedStatement ps = connection
					.prepareStatement(Consts.DELETE_ONE_PUBLICATION_QUERY);
			ps.setInt(1, id);
			ps.execute();
			Statement stmt = connection.createStatement();
			stmt.execute(Consts.RESET_AUTO_INCREMENT_PUBLICATION_QUERY);
			isDeleted = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isDeleted;
	}

	// -------------------- Méthode deleteAllPublication ------------

	@Override
	public boolean deleteAllPublication() {
		boolean areDeleted = false;
		try {
			Statement stmt = connection.createStatement();
			stmt.execute(Consts.DELETE_ALL_PUBLICATION_QUERY);
			stmt.execute(Consts.RESET_AUTO_INCREMENT_PUBLICATION_QUERY);
			areDeleted = true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return areDeleted;
	}

}
