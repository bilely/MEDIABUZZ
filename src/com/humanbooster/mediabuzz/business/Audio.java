package com.humanbooster.mediabuzz.business;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Audio extends Dynamique{

	public Audio(int id, Utilisateur auteur, String titre, int idAuteur,
			String description, int nbVue, List<Tag> tags, Time duree) {
		super(id, auteur, titre, idAuteur, description, nbVue, tags, duree);
	}
}
