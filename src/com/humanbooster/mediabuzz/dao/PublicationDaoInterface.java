package com.humanbooster.mediabuzz.dao;

import java.util.List;

import com.humanbooster.mediabuzz.business.Publication;
import com.humanbooster.mediabuzz.business.Utilisateur;

public interface PublicationDaoInterface {
	public boolean createPublication(Publication publication);
	public List<Publication> getAllPublication(String nom);
	public Publication getPublication(int id);
	public boolean updatePublication(Publication publication);
	public boolean deletePublication(int id);
	boolean deleteAllPublication();
}
