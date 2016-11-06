package com.humanbooster.mediabuzz.business;

import java.util.Date;

public class Publication {
	private String auteur;
	private Date datePublication;
	private String titre;
	
	public Publication(String auteur, Date datePublication, String titre) {
		this.auteur = auteur;
		this.datePublication = datePublication;
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
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
