package com.humanbooster.mediabuzz.business;

import java.util.Date;
import java.util.List;

public abstract class Statique extends Media{

	private int idStatique;

	/**
	 * @param idPublication
	 * @param auteur
	 * @param datePublication
	 * @param titre
	 * @param idAuteur
	 * @param idMedia
	 * @param description
	 * @param nbVue
	 * @param tags
	 * @param taille
	 * @param adresse
	 * @param idStatique
	 */
	public Statique(int idPublication, Utilisateur auteur, Date datePublication,
			String titre, int idAuteur, int idMedia, String description,
			int nbVue, List<Tag> tags, int taille, String adresse,
			int idStatique) {
		super(idPublication, auteur, datePublication, titre, idAuteur, idMedia,
				description, nbVue, tags, taille, adresse);
		this.idStatique = idStatique;
	}

	@Override
	public String toString() {
		return "Statique [idStatique=" + idStatique + "]";
	}

}
