package com.humanbooster.mediabuzz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.humanbooster.mediabuzz.business.Media;
import com.humanbooster.mediabuzz.business.Publication;
import com.humanbooster.mediabuzz.business.Utilisateur;
import com.humanbooster.mediabuzz.dao.MediaDao;
import com.humanbooster.mediabuzz.utils.Consts;
import com.humanbooster.mediabuzz.utils.DateManager;

public class MediaDaoImpl implements MediaDao {
	
	private static Logger logger = Logger.getLogger(MediaDaoImpl.class);

	@Override
	public boolean createMedia(Media audio) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Media getMedia(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Media> getAudios(Utilisateur user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Media> getAllAudio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean upDateAudio(Media media) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean upDateMedia(List<Media> Medias) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMedia(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMedias(Utilisateur user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAllMedias() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
