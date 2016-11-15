package com.humanbooster.mediabuzz.business;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public abstract class Dynamique extends Media{
	private static final int DUREE_MAX = 10;
	private Time duree;

	public Dynamique(int id, Utilisateur auteur, String titre, int idAuteur,
			String description, int nbVue, List<Tag> tags, Time duree) {
		super(id, auteur, titre, idAuteur, description, nbVue, tags);
		this.duree = duree;
	}

	public Time getDuree() {
		return duree;
	}

	public void setDuree(Time duree) {
		this.duree = duree;
	}

	public static int getDureeMax() {
		return DUREE_MAX;
	}

	@Override
	public String toString() {
		return "Dynamique [duree=" + duree + "]";
	}
	
}
