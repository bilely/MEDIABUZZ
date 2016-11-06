package com.humanbooster.mediabuzz.business;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public abstract class Dynamique extends Media{
	private Time duree;
	private static final int DUREE_MAX = 10;
	
	public Dynamique(String auteur, Date datePublication, String titre,
			String description, List<Tag> tags) {
		super(auteur, datePublication, titre, description, tags);
		
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
