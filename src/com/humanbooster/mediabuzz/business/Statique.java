package com.humanbooster.mediabuzz.business;

import java.util.Date;
import java.util.List;

public abstract class Statique extends Media{
	private static final int TAILLE_MAX_IMG= 2;

	public Statique(int id, Utilisateur auteur, String titre, int idAuteur,
			String description, int nbVue, List<Tag> tags) {
		super(id, auteur, titre, idAuteur, description, nbVue, tags);
		// TODO Auto-generated constructor stub
	}

	public static int getTailleMaxImg() {
		return TAILLE_MAX_IMG;
	}
	
}
