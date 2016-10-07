package com.humanbooster.mediabuzz.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.humanbooster.mediabuzz.business.Administrateur;
import com.humanbooster.mediabuzz.business.Utilisateur;
import com.humanbooster.mediabuzz.service.AdministrateurService;

public class AdministrateurServiceImpl implements AdministrateurService {
	
	private List<Administrateur> administrateur = new ArrayList<>();

	@Override
	public Administrateur ajouterAdministrateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean supAdministrateur(Administrateur administrateur) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean bloquerUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean supUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean debloquerUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
