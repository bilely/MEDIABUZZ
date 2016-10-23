package com.humanbooster.mediabuzz.service;

import java.util.List;

import com.humanbooster.mediabuzz.business.Media;

public interface MediaService {

	public List<Media> mediaParOrdreAntichronologiqueSql();

	public List<Media> mediaParOrdreTopSql();

	public List<Media> mediaParOrdreFlopSql();

	public List<Media> mediaParNbVueSql();

	List<Media> mediaParTagSql(String tag);

	List<Media> mediaParAuteurSql(String auteur);

	
}
