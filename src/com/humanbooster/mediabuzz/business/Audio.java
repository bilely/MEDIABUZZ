package com.humanbooster.mediabuzz.business;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Audio extends Dynamique{

	private int idAudio;

	/**
	 * @param idPublication
	 * @param auteur
	 * @param datePublication
	 * @param titre
	 * @param idAuteur
	 * @param idMedia
	 * @param description
	 * @param nbVue
	 * @param tags
	 * @param taille
	 * @param adresse
	 * @param idDynamique
	 * @param duree
	 * @param idAudio
	 */
	public Audio(int idPublication, Utilisateur auteur, Date datePublication,
			String titre, int idAuteur, int idMedia, String description,
			int nbVue, List<Tag> tags, int taille, String adresse,
			int idDynamique, Time duree, int idAudio) {
		super(idPublication, auteur, datePublication, titre, idAuteur, idMedia,
				description, nbVue, tags, taille, adresse, idDynamique, duree);
		this.idAudio = idAudio;
	}

	public int getIdAudio() {
		return idAudio;
	}

	public void setIdAudio(int idAudio) {
		this.idAudio = idAudio;
	}

	@Override
	public String toString() {
		return "Audio [idAudio=" + idAudio + "]";
	}

}
