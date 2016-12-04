package com.humanbooster.mediabuzz.business;

import java.util.Date;

public class Commentaire extends Publication {
	
	private String contenu;
	private Publication publication;

	/**
	 * @param idPublication
	 * @param auteur
	 * @param datePublication
	 * @param titre
	 * @param idAuteur
	 * @param contenu
	 * @param publication
	 */
	public Commentaire(int idPublication, Utilisateur auteur,
			Date datePublication, String titre, int idAuteur, String contenu,
			Publication publication) {
		super(idPublication, auteur, datePublication, titre, idAuteur);
		this.contenu = contenu;
		this.publication = publication;
	}

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
