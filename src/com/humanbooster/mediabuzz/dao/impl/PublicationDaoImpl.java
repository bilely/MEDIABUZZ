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
import com.humanbooster.mediabuzz.dao.PublicationDao;
import com.humanbooster.mediabuzz.utils.Consts;
import com.humanbooster.mediabuzz.utils.DateManager;

public class PublicationDaoImpl implements PublicationDao {


	private static Logger logger = Logger.getLogger(PublicationDaoImpl.class);
	
	private UtilisateurDaoImpl uDaoImpl;

	@Override
	public boolean createPublication(Publication publication) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Publication> getAllPublication(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertAllPublication(List<Publication> publications) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Publication getPublication(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updatePublication(Publication publication) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int nbPublication(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deletePublication(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAllPublication() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
