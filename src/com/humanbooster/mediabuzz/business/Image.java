package com.humanbooster.mediabuzz.business;

import java.util.Date;
import java.util.List;

public class Image extends Statique{

	public Image(String auteur, Date datePublication, String titre,
			String description, List<Tag> tags) {
		super(auteur, datePublication, titre, description, tags);
		
	}
	
}
