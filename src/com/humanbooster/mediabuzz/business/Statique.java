package com.humanbooster.mediabuzz.business;

import java.util.Date;
import java.util.List;

public abstract class Statique extends Media{
	private static final int TAILLE_MAX_IMG= 2;

	public Statique(Utilisateur auteur, Date datePublication, String titre) {
		super(auteur, datePublication, titre);
		// TODO Auto-generated constructor stub
	}



	public static int getTailleMaxImg() {
		return TAILLE_MAX_IMG;
	}
	
}
