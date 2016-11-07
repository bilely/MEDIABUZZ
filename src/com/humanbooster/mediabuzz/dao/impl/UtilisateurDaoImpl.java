package com.humanbooster.mediabuzz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.PropertyConfigurator;

import com.humanbooster.mediabuzz.business.Utilisateur;
import com.humanbooster.mediabuzz.dao.UtilisateurDao;
import com.humanbooster.mediabuzz.utils.Consts;
import com.humanbooster.mediabuzz.utils.UtilAndSqlDateManager;


public class UtilisateurDaoImpl implements UtilisateurDao {
	
private Connection connection;
	

	// ----------------------------- Constructeur ---------------------------------------
	public UtilisateurDaoImpl(Connection connection) {
		this.connection = connection;
		String log4jConfPath = Consts.LOG4J_CONF_PATH;
		PropertyConfigurator.configure(log4jConfPath);
	}

	// ----------------------------- Méthode createUser ---------------------------------
	@Override
	public boolean createUser(Utilisateur u){
		boolean isCreated = false;
		try {
			PreparedStatement ps = connection.prepareStatement(Consts.CREATE_USER_QUERY);
			ps.setString(1, u.getNom());
			ps.setString(2, u.getMail());
			ps.setString(3, u.getMotDePasse());
			ps.setDate(4,  UtilAndSqlDateManager.convertUtilDateToSqlDate(u.getDateInscription()));
			ps.setBoolean(5, u.isCompteActif());
			ps.execute();
			isCreated = true;	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isCreated;
	}

	// ----------------------------- Méthode getUser ---------------------------------
	@Override
	public Utilisateur getUser(int id) {
		Utilisateur user = null;
		try {
			PreparedStatement ps = connection.prepareStatement(Consts.GET_USER_QUERY);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()){
				user = new Utilisateur(rs.getString(2),rs.getString(3),rs.getDate(4),rs.getString(5),rs.getBoolean(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	// ----------------------------- Méthode updateUser ---------------------------------
	@Override
	public boolean updateUser() {
		// TODO Auto-generated method stub
		return false;
	}

	// ----------------------------- Méthode addUser ---------------------------------
	@Override
	public Utilisateur addUser() {
		// TODO Auto-generated method stub
		return null;
	}

	// ----------------------------- Méthode deleteUser ---------------------------------
	@Override
	public boolean deleteUser() {
		// TODO Auto-generated method stub
		return false;
	}

	// ----------------------------- Méthode deleteAllUser ---------------------------------
	@Override
	public boolean deleteAllUser() {
		boolean areDeleted = false;
		try{
			Statement stmt = connection.createStatement();
			stmt.execute(Consts.DELETE_ALL_USER_QUERY);
			stmt.execute(Consts.RESET_AUTO_INCREMENT_USER_QUERY);
			areDeleted = true;
						
		}catch(SQLException e){
			e.printStackTrace();
		}	
		return areDeleted;
	}

}
