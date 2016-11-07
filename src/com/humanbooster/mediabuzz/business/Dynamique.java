package com.humanbooster.mediabuzz.business;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public abstract class Dynamique extends Media{
	private static final int DUREE_MAX = 10;
	private Time duree;

	public Dynamique(Utilisateur auteur, Date datePublication, String titre,
			Time duree) {
		super(auteur, datePublication, titre);
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
