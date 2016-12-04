package com.humanbooster.mediabuzz;

import java.sql.Time;
import java.util.List;

import com.humanbooster.mediabuzz.business.Audio;
import com.humanbooster.mediabuzz.business.Tag;
import com.humanbooster.mediabuzz.business.Utilisateur;

public class AudioClient {

	public static void main(String[] args) {
		int id = 0;
		Utilisateur test = null;
		String titre = null;
		int idAuteur = 0;
		String description = null;
		int nbVue = 0;
		List<Tag> tags = null;
		int taille = 0;
		String adresse = null;
		Time duree = null;
		
	/*	int id, Utilisateur auteur, String titre, int idAuteur,
		String description, int nbVue, List<Tag> tags, int taille,
		String adresse, Time duree*/
		
		Audio music = new Audio(0, null, null, adresse, 0, taille, null, 0, null, 0, null, taille, null, taille);
		music.setIdAudio(id);
		music.setAuteur(test);
		music.setTitre(titre);
		music.setIdAuteur(idAuteur);//TODO Gerer l'auteur
		music.setDescription(description);
		music.setNbVue(nbVue);//TODO gerer le nombre de vue
		music.setTags(tags);
		music.setTaille(taille);
		music.setAdresse(adresse);
		music.setDuree(duree);//TODO ger un temps
	}

}
