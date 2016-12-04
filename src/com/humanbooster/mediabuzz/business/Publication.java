package com.humanbooster.mediabuzz.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Publication {
	private int idPublication;
	private Utilisateur auteur;
	private Date datePublication;
	private String titre;
	private int idAuteur;
	
	/**
	 * @param idPublication
	 * @param auteur
	 * @param datePublication
	 * @param titre
	 * @param idAuteur
	 */
	public Publication(int idPublication, Utilisateur auteur,
			Date datePublication, String titre, int idAuteur) {
		super();
		this.idPublication = idPublication;
		this.auteur = auteur;
		this.datePublication = datePublication;
		this.titre = titre;
		this.idAuteur = idAuteur;
	}

	public int getIdPublication() {
		return idPublication;
	}

	public void setIdPublication(int idPublication) {
		this.idPublication = idPublication;
	}

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

	public int getIdAuteur() {
		return idAuteur;
	}

	public void setIdAuteur(int idAuteur) {
		this.idAuteur = idAuteur;
	}

	@Override
	public String toString() {
		return "Publication [idPublication=" + idPublication + ", auteur="
				+ auteur + ", datePublication=" + datePublication + ", titre="
				+ titre + ", idAuteur=" + idAuteur + "]";
	}
	
}
