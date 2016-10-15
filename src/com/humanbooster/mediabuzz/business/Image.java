package com.humanbooster.mediabuzz.business;

import java.util.Date;
import java.util.List;

public class Image extends Statique{
	//Attributs
	
	//Constructeur
	
	public Image(String auteur, Utilisateur utilisateur, Date datePublication,
			List<Tag> tags, List<Commentaire> commentaires, String description,
			int taille, List<Vote> votes, List<Alerte> alertes, int nbVue) {
		super(auteur, utilisateur, datePublication, tags, commentaires, description,
				taille, votes, alertes, nbVue);
		// TODO Auto-generated constructor stub
		
	//Getteur et Seteurs
		
	//ToString
	}
	
	
}
