package com.humanbooster.mediabuzz.dao;

import com.humanbooster.mediabuzz.business.Utilisateur;

public interface UtilisateurDao {	
	
	public boolean createUser(Utilisateur u);
	public Utilisateur getUser();
	public boolean updateUser();
	public Utilisateur addUser();
	public boolean deleteUser();
	boolean deleteAllUser();
}
