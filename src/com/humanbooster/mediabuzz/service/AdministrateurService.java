package com.humanbooster.mediabuzz.service;

import com.humanbooster.mediabuzz.business.Administrateur;
import com.humanbooster.mediabuzz.business.Alerte;
import com.humanbooster.mediabuzz.business.Commentaire;
import com.humanbooster.mediabuzz.business.Utilisateur;

public interface AdministrateurService {
	
	public Administrateur ajouterAdministrateur(Utilisateur utilisateur);
	
	public boolean supAdministrateur(Administrateur administrateur);
	
	public boolean bloquerUtilisateur(Utilisateur utilisateur);
	
	public boolean supUtilisateur(Utilisateur utilisateur);
	
	public boolean debloquerUtilisateur(Utilisateur utilisateur);
	
//	public boolean supCommentaire(Commentaire commentaire);
//
//	public void visualiserAlerte(Alerte alerte);
//
//	public boolean supAlerte(Alerte alerte);

}
