package com.humanbooster.mediabuzz.utils;

public final class Consts {

	public static final String LOG4J_CONF_PATH = "C:\\Formation\\Java\\workspace\\MEDIABUZZ\\resources\\log4j.properties";

	// Constante numerique
	private static final int TAILLE_TELEVERSEMET_MAX = 10;// TODO
	private static final int NB_MAX_TAG = 5;// TODO
	private static final int TAILLE_MAX_IMG = 2;// TODO
	private static final int DUREE_MAX = 10;// TODO

	// Utilisateur
	public static final String CREATE_USER_QUERY = "INSERT INTO utilisateur (nom, mail, mdp, dateInscription, compteActif) VALUES (?,?,?,?,?)";

	public static final String DELETE_ALL_USER_QUERY = "DELETE FROM utilisateur";
	public static final String RESET_AUTO_INCREMENT_USER_QUERY = "ALTER TABLE utilisateur AUTO_INCREMENT = 1";

	public static final String GET_USER_QUERY = "SELECT * FROM utilisateur WHERE nom = ?";

	// Publication
	public static final String CREATE_PUBLICATION_QUERY = "INSERT INTO publication (auteur,datePublication,titre,ID_User) VALUES (?,?,?,?)";
	public static final String RESET_AUTO_INCREMENT_PUBLICATION_QUERY = "ALTER TABLE publication AUTO_INCREMENT = 1";

	public static final String GET_ALL_PUBLICATION_TO_ONE_QUERY = "SELECT * FROM publication WHERE auteur = ?";
	public static final String GET_ONE_PUBLICATION = "SELECT*FROM publication WHERE ID_publication = ?";

	public static final String UPDATE_PUBLICATION_QUERY = "UPDATE publication SET datePublication = CURRENT_TIMESTAMP WHERE ID_publication = ?";

	public static final String COUNT_PUBLICATION_TO_QUERY = "SELECT COUNT(*) FROM publication WHERE ID_user = ?";

	public static final String DELETE_ONE_PUBLICATION_QUERY = "DELETE FROM publication WHERE ID_publication = ?";
	public static final String DELETE_ALL_PUBLICATION_QUERY = "DELETE FROM publication";

	// Media
	public static final String CREATE_MEDIA_QUERY = "INSERT INTO media (description,nbvue,taille,adresse,ID_publication) VALUES (?,?,?,?,?)";

	public static final String GET_MEDIA_QUERY = "SELECT*FROM media WHERE ID_media = ?";
	public static final String GET_MEDIA_TO_ONE_QUERY = "SELECT*FROM media WHERE ID_auteur = ?";
	public static final String GET_ALL_MEDIA_QUERY = "SELECT*FROM media";

	public static final String UPDATE_MEDIA_QUERY = "UPDATE media SET ID_media = ? WHERE ID_publication";

	public static final String DELETE_ONE_MEDIA_QUERY = "DELETE FROM media WHERE ID_media = ?";
	public static final String DELETE_ALL_MEDIA_QUERY = "DELETE FROM media";

	// MediaDynamique
	public static final String CREATE_MEDIA_DYNAMIQUE_QUERY = "INSERT INTO mediaDynamique (duree,ID_media,ID_publcation) VALUES (?,?,?)";

	public static final String GET_MEDIA_DYNAMIQUE_QUERY = "SELECT*FROM mediaDynamique WHERE ID_publication = ?";
	public static final String GET_ALL_MEDIA_DYNAMIQUE_QUERY = "SELECT*FROM mediaDynamique";

	public static final String UPDATE_MEDIA_DYNAMIQUE_QUERY = "UPDATE mediaDynamique SET ID_media = ? WHERE ID_publication";

	public static final String DELETE_ONE_MEDIA_DYNAMIQUE_QUERY = "DELETE FROM mediaDynamique WHERE ID_mediaDynamique = ?";
	public static final String DELETE_ALL_MEDIA_DYNAMIQUE_QUERY = "DELETE FROM mediaDynamique";

	// MediaStatique
	public static final String CREATE_MEDIA_STATIQUE_QUERY = "INSERT INTO mediaStatique (ID_media,ID_publcation) VALUES (?,?,?)";

	public static final String GET_MEDIA_STATIQUE_QUERY = "SELECT*FROM mediaStatique WHERE ID_publication = ?";
	public static final String GET_ALL_MEDIA_STATIQUE_QUERY = "SELECT*FROM mediaStatique";

	public static final String UPDATE_MEDIA_STATIQUE_QUERY = "UPDATE mediaStatique SET ID_media = ? WHERE ID_publication";

	public static final String DELETE_ONE_MEDIA_STATIQUE_QUERY = "DELETE FROM mediaStatique WHERE ID_mediaDynamique = ?";
	public static final String DELETE_ALL_MEDIA_STATIQUE_QUERY = "DELETE FROM mediaStatique";

	// Audio
	public static final String CREATE_AUDIO_QUERY = "INSERT INTO audio (ID_mediaDynamique,ID_media,ID_publication) VALUES (?,?)";

	public static final String GET_AUDIO_QUERY = "SELECT*FROM audio WHERE ID_publication = ?";
	public static final String GET_ALL_AUDIO_QUERY = "SELECT*FROM audio";

	public static final String UPDATE_AUDIO_QUERY = "UPDATE audio SET ID_media = ? WHERE ID_publication";

	public static final String DELETE_ONE_AUDIO_QUERY = "DELETE FROM audio WHERE ID_audio = ?";
	public static final String DELETE_ALL_AUDIO_QUERY = "DELETE FROM audio";

	// Image
	public static final String CREATE_IMAGE_QUERY = "INSERT INTO image (ID_mediaStatique,ID_media,ID_publication) VALUES (?,?,?)";

	public static final String GET_IMAGE_QUERY = "SELECT*FROM image WHERE ID_publication = ?";
	public static final String GET_ALL_IMAGE_QUERY = "SELECT*FROM image";

	public static final String UPDATE_IMAGE_QUERY = "UPDATE image SET ID_media = ? WHERE ID_publication";

	public static final String DELETE_ONE_IMAGE_QUERY = "DELETE FROM image WHERE ID_image = ?";
	public static final String DELETE_ALL_IMAGE_QUERY = "DELETE FROM image";

}
