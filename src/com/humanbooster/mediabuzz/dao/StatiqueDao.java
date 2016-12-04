package com.humanbooster.mediabuzz.dao;

import java.util.List;

import com.humanbooster.mediabuzz.business.Statique;
import com.humanbooster.mediabuzz.business.Utilisateur;

public interface StatiqueDao {
	public boolean createStatique(Statique statiqu);

	public Statique getStatique(int id);

	public List<Statique> getStatiques(Utilisateur user);

	public List<Statique> getAllStatiques();

	public boolean upDateStatique(Statique statique);

	public boolean upDateStatiques(List<Statique> statiques);

	public boolean deleteStatique(int id);

	public boolean deleteStatiques(Utilisateur user);

	public boolean deleteAllStatiques();
}
