package com.humanbooster.mediabuzz.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public abstract class Media extends Publication{
	
	private String description;
	private int nbVue = 0;
	private List<Tag> tags = new ArrayList<>();
	private int taille;
	private String adresse;
	
	public Media(int id, Utilisateur auteur, Date datePublication, String titre,
			int idAuteur) {
		super(id, auteur, datePublication, titre, idAuteur);
		// TODO Auto-generated constructor stub
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public int getNbVue() {
		return nbVue;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Media [description=" + description + ", nbVue=" + nbVue
				+ ", tags=" + tags + ", adresse=" + adresse + "]";
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}
}