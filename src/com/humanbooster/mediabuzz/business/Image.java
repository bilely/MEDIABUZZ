package com.humanbooster.mediabuzz.business;

import java.util.Date;
import java.util.List;

public class Image extends Statique{

	private int idImage;

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
	 * @param idImage
	 */
	public Image(int idPublication, Utilisateur auteur, Date datePublication,
			String titre, int idAuteur, int idMedia, String description,
			int nbVue, List<Tag> tags, int taille, String adresse,
			int idStatique, int idImage) {
		super(idPublication, auteur, datePublication, titre, idAuteur, idMedia,
				description, nbVue, tags, taille, adresse, idStatique);
		this.idImage = idImage;
	}

	public int getIdImage() {
		return idImage;
	}

	public void setIdImage(int idImage) {
		this.idImage = idImage;
	}

	@Override
	public String toString() {
		return "Image [idImage=" + idImage + "]";
	}
	
}
