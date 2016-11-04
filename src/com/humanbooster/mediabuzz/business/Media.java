package com.humanbooster.mediabuzz.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Media {

	// Declaration des attributs
	private final int NOMBRE_TAG_ASSOCIE_MAX = 5;
	private String auteur; // En cas ou l'auteur n'est pas le publicateur.TODO!
	private Utilisateur utilisateur;
	private Date datePublication;
	private List<Tag> tags = new ArrayList<>();
	private List<Commentaire> commentaires = new ArrayList<>();
	private String description;
	private int taille;
	private int nbVue;
	private Vote vote;
	private List<Alerte> alertes = new ArrayList<>();

	// Constructors
	public Media(String auteur, Utilisateur utilisateur, Date datePublication,
			List<Tag> tags, List<Commentaire> commentaires, String description,
			int taille, Vote vote, List<Alerte> alertes, int nbVue) {
		super();
		this.auteur = auteur;
		this.utilisateur = utilisateur;
		this.datePublication = datePublication;
		this.tags = tags;
		this.commentaires = commentaires;
		this.description = description;
		this.taille = taille;
		this.nbVue = nbVue;
		this.vote = vote;
		this.alertes = alertes;
	}

	// Methods
	
	
	// gets&sets
	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Date getDatePublication() {
		return datePublication;
	}

	public void setDatePublication(Date datePublication) {
		this.datePublication = datePublication;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public List<Commentaire> getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(List<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public int getNbVue() {
		return nbVue;
	}

	public void setNbVue(int nbVue) {
		this.nbVue = nbVue;
	}

	public Vote getVote() {
		return vote;
	}

	public void setVote(Vote vote) {
		this.vote = vote;
	}

	public List<Alerte> getAlertes() {
		return alertes;
	}

	public void setAlertes(List<Alerte> alertes) {
		this.alertes = alertes;
	}

	public int getNOMBRE_TAG_ASSOCIE_MAX() {
		return NOMBRE_TAG_ASSOCIE_MAX;
	}

}