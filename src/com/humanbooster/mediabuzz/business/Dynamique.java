package com.humanbooster.mediabuzz.business;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public abstract class Dynamique extends Media{

	private Time duree;
	
	public Dynamique(int id, Utilisateur auteur, Date datePublication,
			String titre, int idAuteur, Time duree) {
		super(id, auteur, datePublication, titre, idAuteur);
		this.duree = duree;
	}

	public Time getDuree() {
		return duree;
	}

	public void setDuree(Time duree) {
		this.duree = duree;
	}

	@Override
	public String toString() {
		return "Dynamique [duree=" + duree + "]";
	}
	
}
