package com.humanbooster.mediabuzz.dao;

import java.util.List;

import com.humanbooster.mediabuzz.business.Dynamique;
import com.humanbooster.mediabuzz.business.Utilisateur;

public interface DynamiqueDao {
	public boolean createDynamique(Dynamique dynamique);

	public Dynamique getDynamique(int id);

	public List<Dynamique> getDynamique(Utilisateur user);

	public List<Dynamique> getDynamiques();

	public boolean upDateDynamique(Dynamique audio);

	public boolean upDateDynamiques(List<Dynamique> dynamiques);

	public boolean deleteDynamique(int id);

	public boolean deleteDynamiques(Utilisateur user);

	public boolean deleteAllDynamiques();
}
