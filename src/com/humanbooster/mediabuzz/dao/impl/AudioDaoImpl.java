package com.humanbooster.mediabuzz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.humanbooster.mediabuzz.business.Audio;
import com.humanbooster.mediabuzz.business.Publication;
import com.humanbooster.mediabuzz.business.Utilisateur;
import com.humanbooster.mediabuzz.dao.AudioDao;
import com.humanbooster.mediabuzz.utils.Consts;
import com.humanbooster.mediabuzz.utils.DateManager;

public class AudioDaoImpl implements AudioDao {

	private Connection connection;
	private static Logger logger = Logger.getLogger(AudioDaoImpl.class);
	private UtilisateurDaoImpl uDaoImpl;
	private PublicationDaoImpl pubDaoImpl;
	private AudioDaoImpl aDaoImpl;
	
	public AudioDaoImpl(Connection connection) {
		this.connection = connection;
		String log4jConfPath = Consts.LOG4J_CONF_PATH;
		PropertyConfigurator.configure(log4jConfPath);
		uDaoImpl = new UtilisateurDaoImpl(connection);
		pubDaoImpl = new PublicationDaoImpl(connection);
		aDaoImpl = new AudioDaoImpl(connection);
	}
	@Override
	public boolean createAudio(Audio audio) {
		boolean isCreated = false;
		try {
			
			PreparedStatement ps4 = connection.prepareStatement(Consts.CREATE_AUDIO_QUERY);
			ps4.setInt(1, audio.getIdDynamique());
			ps4.setInt(2, audio.getIdMedia());
			ps4.setInt(3, audio.getIdPublication());
			ps4.execute();
			isCreated = true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isCreated;
	}

	@Override
	public Audio getAudio(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Audio> getAudios(Utilisateur user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Audio> getAllAudio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean upDateAudio(Audio audio) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean upDateAudios(List<Audio> audios) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAudio(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAudios(Utilisateur user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAllAudios() {
		// TODO Auto-generated method stub
		return false;
	}

}
