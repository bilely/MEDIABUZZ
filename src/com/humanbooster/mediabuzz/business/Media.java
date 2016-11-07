package com.humanbooster.mediabuzz.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public abstract class Media extends Publication{
	public Media(Utilisateur auteur, Date datePublication, String titre) {
		super(auteur, datePublication, titre);
		// TODO Auto-generated constructor stub
	}

	private static final int TAILLE_TELEVERSEMET_MAX = 10;
	private static final int NB_MAX_TAG = 5;
	private String description;
	private int nbVue = 0;
	private List<Tag> tags = new ArrayList<>();
	private List<Alerte> alertes = new ArrayList<>();

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

	@Override
	public String toString() {
		return "Media [description=" + description + ", nbVue=" + nbVue
				+ ", tags=" + tags + "]";
	}

	public static int getNbMaxTag() {
		return NB_MAX_TAG;
	}

	public static int getTailleTeleversemetMax() {
		return TAILLE_TELEVERSEMET_MAX;
	}

	public List<Alerte> getAlertes() {
		return alertes;
	}

	public void setAlertes(List<Alerte> alertes) {
		this.alertes = alertes;
	}
	
}