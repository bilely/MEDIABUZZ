package com.humanbooster.mediabuzz.business;

import java.util.Date;
import java.util.List;

public abstract class Statique extends Media{
	private static final int TAILLE_MAX_IMG= 2;

	public Statique(String auteur, Date datePublication, String titre,
			String description, List<Tag> tags) {
		super(auteur, datePublication, titre, description, tags);
	}

	public static int getTailleMaxImg() {
		return TAILLE_MAX_IMG;
	}
	
}
