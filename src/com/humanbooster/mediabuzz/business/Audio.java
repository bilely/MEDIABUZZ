package com.humanbooster.mediabuzz.business;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Audio extends Dynamique{

	public Audio(int id, Utilisateur auteur, Date datePublication, String titre,
			int idAuteur, Time duree) {
		super(id, auteur, datePublication, titre, idAuteur, duree);
		// TODO Auto-generated constructor stub
	}	
}
