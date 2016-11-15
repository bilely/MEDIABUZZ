package com.humanbooster.mediabuzz.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public abstract class Media extends Publication{
	

	private static final int TAILLE_TELEVERSEMET_MAX = 10;
	private static final int NB_MAX_TAG = 5;
	private String description;
	private int nbVue = 0;
	private List<Tag> tags = new ArrayList<>();
	
	public Media(int id, Utilisateur auteur, String titre, int idAuteur,
			String description, int nbVue, List<Tag> tags) {
		super(id, auteur, titre, idAuteur);
		this.description = description;
		this.nbVue = nbVue;
		this.tags = tags;
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
}