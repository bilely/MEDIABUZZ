package com.humanbooster.mediabuzz.business;

import java.util.Date;

public class Utilisateur {

	private int id;
	private String nom;
	private String mail;
	private String motDePasse;
	private Date dateInscription;
	private boolean compteActif;

	// ------------------------------------ Constructeurs -------------------------------------

	public Utilisateur(int id, String nom, String mail, String motDePasse) {
		this.id = id;
		this.nom = nom;
		this.mail = mail;
		this.motDePasse = motDePasse;//TODO generateur de mot de passe random
		this.dateInscription = new Date();
		this.compteActif = true;
	}
	

	// ------------------------------------ Getters et Setters -------------------------------------

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public boolean isCompteActif() {
		return compteActif;
	}

	public void setCompteActif(boolean compteActif) {
		this.compteActif = compteActif;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	// ------------------------------------ ToString -------------------------------------
	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", mail=" + mail + ", motDePasse=" + motDePasse
				+ ", compteActif=" + compteActif + "]";
	}


}
