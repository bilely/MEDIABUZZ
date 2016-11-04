package com.humanbooster.mediabuzz.business;

import java.util.Date;
import java.util.List;

public abstract class Statique extends Media{

	public Statique(String auteur, Utilisateur utilisateur,
			Date datePublication, List<Tag> tags,
			List<Commentaire> commentaires, String description, int taille,
			Vote vote, List<Alerte> alertes, int nbVue) {
		super(auteur, utilisateur, datePublication, tags, commentaires, description,
				taille, vote, alertes, nbVue);
		// TODO Auto-generated constructor stub
	}
	
	

}
