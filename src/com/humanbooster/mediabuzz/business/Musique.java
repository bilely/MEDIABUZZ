package com.humanbooster.mediabuzz.business;

import java.util.Date;
import java.util.List;

public class Musique extends Dynamique{

	//Attribut
	Dynamique dynamique;

	//Constructeur
	public Musique(String auteur, Utilisateur utilisateur, Date datePublication,
			List<Tag> tags, List<Commentaire> commentaires, String description,
			int taille, Vote vote, List<Alerte> alertes, int nbVue, Media media,
			String duree, Dynamique dynamique) {
		super(auteur, utilisateur, datePublication, tags, commentaires,
				description, taille, vote, alertes, nbVue, media, duree);
		this.dynamique = dynamique;
	}

	
	
	
	
	//Geteurs et Seteurs
	
	//ToString
}
