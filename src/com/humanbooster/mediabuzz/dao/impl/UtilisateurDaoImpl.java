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
import com.humanbooster.mediabuzz.utils.DateManager;

public class UtilisateurDaoImpl implements UtilisateurDao {

	private Connection connection;

	@Override
	public boolean createUser(Utilisateur u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Utilisateur getUser(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateUser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Utilisateur addUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAllUser() {
		// TODO Auto-generated method stub
		return false;
	}

}
