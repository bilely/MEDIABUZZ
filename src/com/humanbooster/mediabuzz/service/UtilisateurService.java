package com.humanbooster.mediabuzz.service;

import com.humanbooster.mediabuzz.business.Utilisateur;

public interface UtilisateurService {
	public boolean bloquerUtilisateur(Utilisateur utilisateur);
	
	public boolean supUtilisateur(Utilisateur utilisateur);
	
	public boolean debloquerUtilisateur(Utilisateur utilisateur);
}
