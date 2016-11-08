package com.humanbooster.mediabuzz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.humanbooster.mediabuzz.business.Publication;
import com.humanbooster.mediabuzz.business.Utilisateur;
import com.humanbooster.mediabuzz.dao.PublicationDaoInterface;
import com.humanbooster.mediabuzz.utils.Consts;
import com.humanbooster.mediabuzz.utils.UtilAndSqlDateManager;
import com.mysql.jdbc.ResultSetImpl;

public class PublicationDaoImpl implements PublicationDaoInterface {

	private Connection connection;
	private static Logger logger = Logger.getLogger(PublicationDaoImpl.class);
	private UtilisateurDaoImpl uDaoImpl;
	// ----------------------------- Constructeur
	// ---------------------------------------

	public PublicationDaoImpl(Connection connection) {
		this.connection = connection;
		String log4jConfPath = Consts.LOG4J_CONF_PATH;
		PropertyConfigurator.configure(log4jConfPath);
		uDaoImpl = new UtilisateurDaoImpl(connection);
	}

	// --------------------- Méthode createPublication ---------------------

	@Override
	// Utilisateur auteur, Date datePublication, String titre
	public boolean createPublication(Publication publication) {
		boolean isCreated = false;
		System.out.println(publication.getAuteur().getId());
		try {
			PreparedStatement ps = connection
					.prepareStatement(Consts.CREATE_PUBLICATION_QUERY);
			ps.setString(1, publication.getAuteur().getNom());
			ps.setDate(2, UtilAndSqlDateManager.convertUtilDateToSqlDate(
					publication.getDatePublication()));
			ps.setString(3, publication.getTitre());
			ps.setInt(4, publication.getAuteur().getId());
			logger.info(publication.getDatePublication());
			ps.execute();
			isCreated = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isCreated;
	}
	
	// ------------------------ Méthode getPublication---------------------------

	@Override
	public Publication getPublication(int id) {
		Publication publication = null;
		try {
			PreparedStatement ps = connection.prepareStatement(Consts.GET_ONE_PUBLICATION);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Utilisateur temp = uDaoImpl.getUser(rs.getString(2));
				publication = new Publication(id,temp,rs.getDate(3),rs.getString(4),rs.getInt(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return publication;
	}
	
	// ------------------------ Méthode getAllPublication---------------------------

	@Override
	public List<Publication> getAllPublication(String nom) {
		Utilisateur temp = uDaoImpl.getUser(nom);
		logger.info(nom);
		List<Publication> publications = new ArrayList<>();
		try {
			PreparedStatement ps = connection
					.prepareStatement(Consts.GET_ALL_PUBLICATION_TO_ONE_QUERY);
			ps.setString(1, nom);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Publication publication = new Publication(rs.getInt(1), temp,
						UtilAndSqlDateManager.convertSqlDateToUtilDate(
								rs.getDate(3)),
						rs.getString(4),rs.getInt(5));
				publications.add(publication);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return publications;
	}

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

	@Override
	public boolean deletePublication(int id) {
		boolean isDeleted = false;
		try {
			PreparedStatement ps = connection
					.prepareStatement(Consts.DELETE_ONE_PUBLICATION_QUERY);
			ps.setInt(1, id);
			ps.execute();
			isDeleted = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isDeleted;
	}

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
