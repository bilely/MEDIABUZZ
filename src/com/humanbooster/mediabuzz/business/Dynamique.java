package com.humanbooster.mediabuzz.business;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public abstract class Dynamique extends Media{

	private int idDynamique;
	private Time duree;
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
	 */
	public Dynamique(int idPublication, Utilisateur auteur,
			Date datePublication, String titre, int idAuteur, int idMedia,
			String description, int nbVue, List<Tag> tags, int taille,
			String adresse, int idDynamique, Time duree) {
		super(idPublication, auteur, datePublication, titre, idAuteur, idMedia,
				description, nbVue, tags, taille, adresse);
		this.idDynamique = idDynamique;
		this.duree = duree;
	}
	public int getIdDynamique() {
		return idDynamique;
	}
	public void setIdDynamique(int idDynamique) {
		this.idDynamique = idDynamique;
	}
	public Time getDuree() {
		return duree;
	}
	public void setDuree(Time duree) {
		this.duree = duree;
	}
	@Override
	public String toString() {
		return "Dynamique [idDynamique=" + idDynamique + ", duree=" + duree
				+ "]";
	}
}
