package com.humanbooster.mediabuzz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.humanbooster.mediabuzz.business.Publication;
import com.humanbooster.mediabuzz.business.Utilisateur;
import com.humanbooster.mediabuzz.dao.PublicationDaoInterface;
import com.humanbooster.mediabuzz.utils.Consts;
import com.humanbooster.mediabuzz.utils.UtilAndSqlDateManager;

public class PublicationDaoImpl implements PublicationDaoInterface {

	private Connection connection;
	private static Logger logger = Logger.getLogger(PublicationDaoImpl.class);
	private UtilisateurDaoImpl uDaoImpl;
	// ----------------------------- Constructeur ---------------------------------------

	public PublicationDaoImpl(Connection connection) {
		this.connection = connection;
		String log4jConfPath = Consts.LOG4J_CONF_PATH;
		PropertyConfigurator.configure(log4jConfPath);
		uDaoImpl = new UtilisateurDaoImpl(connection);
	}
	
	// ----------------------------- Méthode createPublication ---------------------------------

	@Override
	//Utilisateur auteur, Date datePublication, String titre
	public boolean createPublication(Publication publication) {
		boolean isCreated = false;
		try {
			PreparedStatement ps = connection
					.prepareStatement(Consts.CREATE_PUBLICATION_QUERY);
			ps.setString(1, publication.getAuteur().getNom());
			ps.setDate(2, UtilAndSqlDateManager
					.convertUtilDateToSqlDate(publication.getDatePublication()));
			ps.setString(3, publication.getTitre());
			ps.setInt(4, publication.getAuteur().getId());
			ps.execute();
			isCreated = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isCreated;
	}

	@Override
	public List<Publication> getPublication(String nom) {
		List<Publication> publications = new ArrayList<>();
		try {
			PreparedStatement ps = connection
					.prepareStatement(Consts.GET_PUBLICATION_QUERY);
			ps.setString(1, nom);
			ResultSet rs = ps.executeQuery();
			Utilisateur temp = uDaoImpl.getUser(rs.getString(2)); 
			while (rs.next()) {
				Publication publication = new Publication(temp,UtilAndSqlDateManager.convertSqlDateToUtilDate(rs.getDate(3)), rs.getString(4));
				publications.add(publication);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return publications;
	}

	@Override
	public boolean updatePublication() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Publication addPublication() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deletePublication() {
		// TODO Auto-generated method stub
		return false;
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
