package com.humanbooster.mediabuzz.business;

import java.util.Date;
import java.util.List;

public class Dynamique extends Media{
	
	//Attributs
	private Media media;
	private String duree;
	//Constructeur
	public Dynamique(String auteur, Utilisateur utilisateur,
			Date datePublication, List<Tag> tags,
			List<Commentaire> commentaires, String description, int taille,
			List<Vote> votes, List<Alerte> alertes, Media media, String duree) {
		super(auteur, utilisateur, datePublication, tags, commentaires,
				description, taille, votes, alertes, taille);
		this.media = media;
		this.duree = duree;
	}

	

	
	
	//Geteurs et Seteurs
	
	//ToSTring
}
