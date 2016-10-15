package com.humanbooster.mediabuzz.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Media {

	// Declaration des attributs
	private String auteur; // En cas ou l'auteur n'est pas le publicateur.TODO!
	private Utilisateur utilisateur;
	private Date datePublication;
	private List<Tag> tags = new ArrayList<>();
	private List<Commentaire> commentaires = new ArrayList<>();
	private String description;
	private int taille;
	private int nbVue;
	private List<Vote> votes = new ArrayList<>();
	private List<Alerte> alertes = new ArrayList<>();
	
	// Constructeurs
	public Media(String auteur, Utilisateur utilisateur, Date datePublication,
			List<Tag> tags, List<Commentaire> commentaires, String description,
			int taille, List<Vote> votes, List<Alerte> alertes, int nbVue) {
		super();
		this.auteur = auteur;
		this.utilisateur = utilisateur;
		this.datePublication = datePublication;
		this.tags = tags;
		this.commentaires = commentaires;
		this.description = description;
		this.taille = taille;
		this.nbVue = nbVue;
		this.votes = votes;
		this.alertes = alertes;
	}

	// Geteurs et seteurs

	// ToString
}
