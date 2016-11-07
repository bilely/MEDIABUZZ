package com.humanbooster.mediabuzz.business;

import java.sql.Time;
import java.util.Date;

public class Audio extends Dynamique{

	public Audio(Utilisateur auteur, Date datePublication, String titre,
			Time duree) {
		super(auteur, datePublication, titre, duree);
	}

}
