package com.humanbooster.mediabuzz.dao;

import java.util.List;

import com.humanbooster.mediabuzz.business.Publication;
import com.humanbooster.mediabuzz.business.Utilisateur;

public interface PublicationDaoInterface {
	public boolean createPublication(Publication publication);
	public List<Publication> getPublication(String nom);
	public boolean updatePublication();
	public Publication addPublication();
	public boolean deletePublication();
	boolean deleteAllPublication();
}
