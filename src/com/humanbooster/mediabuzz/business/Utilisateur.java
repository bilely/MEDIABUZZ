package com.humanbooster.mediabuzz.business;

public class Utilisateur {
	private String nom;
	private String mail;
	private boolean compteActif;
	private String motDePasse;
	
	public Utilisateur(String nom, String mail, boolean compteActif,
			String motDePasse) {
		this.nom = nom;
		this.mail = mail;
		this.compteActif = compteActif;
		this.motDePasse = motDePasse;
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

	@Override
	public String toString() {
		return "Utilisateur [nom=" + nom + ", mail=" + mail + ", compteActif="
				+ compteActif + ", motDePasse=" + motDePasse + "]";
	}
}
