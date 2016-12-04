package com.humanbooster.mediabuzz.dao;

import java.util.List;

import com.humanbooster.mediabuzz.business.Media;
import com.humanbooster.mediabuzz.business.Utilisateur;

public interface MediaDao {
	public boolean createMedia(Media audio);

	public Media getMedia(int id);

	public List<Media> getAudios(Utilisateur user);

	public List<Media> getAllAudio();

	public boolean upDateAudio(Media media);

	public boolean upDateMedia(List<Media> Medias);

	public boolean deleteMedia(int id);

	public boolean deleteMedias(Utilisateur user);

	public boolean deleteAllMedias();
}
