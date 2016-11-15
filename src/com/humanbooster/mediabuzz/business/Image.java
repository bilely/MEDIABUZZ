package com.humanbooster.mediabuzz.business;

import java.util.Date;
import java.util.List;

public class Image extends Statique{

	public Image(int id, Utilisateur auteur, String titre, int idAuteur,
			String description, int nbVue, List<Tag> tags) {
		super(id, auteur, titre, idAuteur, description, nbVue, tags);
		// TODO Auto-generated constructor stub
	}
}
