package com.humanbooster.mediabuzz.business;

import java.util.Date;

public class Publication {

	private Utilisateur auteur;
	private Date datePublication;
	private String titre;
	
	// ------------------------------------ Constructeurs -------------------------------------

	public Publication(Utilisateur auteur, String titre) {
		this.auteur = auteur;
		this.datePublication = new Date();
		this.titre = titre;
	}
	
	public Publication(Utilisateur auteur, Date datePublication, String titre) {
		this.auteur = auteur;
		this.datePublication = datePublication;
		this.titre = titre;
	}
	
	// ------------------------------------ Getters et Setters -------------------------------------

	public Utilisateur getAuteur() {
		return auteur;
	}

	public void setAuteur(Utilisateur auteur) {
		this.auteur = auteur;
	}

	public Date getDatePublication() {
		return datePublication;
	}

	public void setDatePublication(Date datePublication) {
		this.datePublication = datePublication;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	@Override
	public String toString() {
		return "Publication [auteur=" + auteur + ", datePublication="
				+ datePublication + ", titre=" + titre + "]";
	}

	
	
	
	
}
