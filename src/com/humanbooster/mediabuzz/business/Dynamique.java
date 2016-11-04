package com.humanbooster.mediabuzz.business;

import java.util.Date;
import java.util.List;

public abstract class Dynamique extends Media{
	
	//Attributs
	private Media media;
	private String duree;
	//Constructeur
	public Dynamique(String auteur, Utilisateur utilisateur,
			Date datePublication, List<Tag> tags,
			List<Commentaire> commentaires, String description, int taille,
			Vote vote, List<Alerte> alertes, int nbVue, Media media,
			String duree) {
		super(auteur, utilisateur, datePublication, tags, commentaires,
				description, taille, vote, alertes, nbVue);
		this.media = media;
		this.duree = duree;
	}
	

	

	
	
	//Geteurs et Seteurs
	
	//ToSTring
}
