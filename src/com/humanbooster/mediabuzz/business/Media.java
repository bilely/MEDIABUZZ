package com.humanbooster.mediabuzz.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public abstract class Media extends Publication{
	
	private int idMedia;
	private String description;
	private int nbVue = 0;
	private List<Tag> tags = new ArrayList<>();
	private int taille;
	private String adresse;
	
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
	 */
	public Media(int idPublication, Utilisateur auteur, Date datePublication,
			String titre, int idAuteur, int idMedia, String description,
			int nbVue, List<Tag> tags, int taille, String adresse) {
		super(idPublication, auteur, datePublication, titre, idAuteur);
		this.idMedia = idMedia;
		this.description = description;
		this.nbVue = nbVue;
		this.tags = tags;
		this.taille = taille;
		this.adresse = adresse;
	}
	public int getIdMedia() {
		return idMedia;
	}
	public void setIdMedia(int idMedia) {
		this.idMedia = idMedia;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNbVue() {
		return nbVue;
	}
	public void setNbVue(int nbVue) {
		this.nbVue = nbVue;
	}
	public List<Tag> getTags() {
		return tags;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return "Media [idMedia=" + idMedia + ", description=" + description
				+ ", nbVue=" + nbVue + ", tags=" + tags + ", taille=" + taille
				+ ", adresse=" + adresse + "]";
	}
	
}