package com.humanbooster.mediabuzz.dao;

import java.util.List;

import com.humanbooster.mediabuzz.business.Audio;
import com.humanbooster.mediabuzz.business.Utilisateur;

public interface AudioDao {
	public boolean createAudio(Audio audio);

	public Audio getAudio(int id);

	public List<Audio> getAudios(Utilisateur user);

	public List<Audio> getAllAudio();

	public boolean upDateAudio(Audio audio);

	public boolean upDateAudios(List<Audio> audios);

	public boolean deleteAudio(int id);

	public boolean deleteAudios(Utilisateur user);

	public boolean deleteAllAudios();
}
