package com.humanbooster.mediabuzz.business;

public class Mail {
	private Utilisateur destinataire;
	private Utilisateur emeteur;
	private String message;
	private String titre;
	
	public Mail(Utilisateur destinataire, Utilisateur emeteur, String message,
			String titre) {
		super();
		this.destinataire = destinataire;
		this.emeteur = emeteur;
		this.message = message;
		this.titre = titre;
	}
	
	public Utilisateur getDestinataire() {
		return destinataire;
	}
	public void setDestinataire(Utilisateur destinataire) {
		this.destinataire = destinataire;
	}
	public Utilisateur getEmeteur() {
		return emeteur;
	}
	public void setEmeteur(Utilisateur emeteur) {
		this.emeteur = emeteur;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	@Override
	public String toString() {
		return "Mail [destinataire=" + destinataire + ", emeteur=" + emeteur
				+ ", message=" + message + ", titre=" + titre + "]";
	}
	
}
