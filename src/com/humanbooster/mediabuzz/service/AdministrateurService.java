package com.humanbooster.mediabuzz.service;

import com.humanbooster.mediabuzz.business.Administrateur;
import com.humanbooster.mediabuzz.business.Utilisateur;

public interface AdministrateurService {
	public Administrateur ajouterAdministrateur(Utilisateur utilisateur);
	
	public Boolean supAdministrateur(Administrateur administrateur);
}
