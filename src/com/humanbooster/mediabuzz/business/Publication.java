package com.humanbooster.mediabuzz.business;

import java.util.Date;

public class Publication {
	private int id;
	private Utilisateur auteur;
	private Date datePublication;
	private String titre;
	private int idAuteur;
	
	// ------------------------------------ Constructeurs -------------------------------------

	public Publication(int id, Utilisateur auteur, String titre) {
		this.id = id;
		this.auteur = auteur;
		this.datePublication = new Date();
		this.titre = titre;
	}
	
	public Publication(int id, Utilisateur auteur, Date datePublication, String titre, int idAuteur) {
		this.auteur = auteur;
		this.datePublication = datePublication;
		this.titre = titre;
		this.setIdAuteur(idAuteur);
	}
	
	// ------------------------------------ Getters et Setters -------------------------------------

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Publication [id=" + id + ", auteur=" + auteur
				+ ", datePublication=" + datePublication + ", titre=" + titre
				+ ", idAuteur=" + idAuteur + "]";
	}

}
