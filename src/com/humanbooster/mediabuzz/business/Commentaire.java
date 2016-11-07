package com.humanbooster.mediabuzz.business;

import java.util.Date;

public class Commentaire extends Publication {
	
	public Commentaire(Utilisateur auteur, Date datePublication, String titre) {
		super(auteur, datePublication, titre);
	}

	private String contenu;
	private Publication publication;

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Publication getPublication() {
		return publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

	@Override
	public String toString() {
		return "Commentaire [contenu=" + contenu + ", publication="
				+ publication + "]";
	}
}
