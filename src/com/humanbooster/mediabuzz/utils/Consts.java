package com.humanbooster.mediabuzz.utils;

public final class Consts {
	
	public static final String LOG4J_CONF_PATH = "C:\\Formation\\Java\\workspace\\MEDIABUZZ\\resources\\log4j.properties";
	
	//Utilisateur
	public static final String CREATE_USER_QUERY = "INSERT INTO utilisateur (nom, mail, mdp, dateInscription, compteActif) VALUES (?,?,?,?,?)";
	
	public static final String DELETE_ALL_USER_QUERY = "DELETE FROM utilisateur";
	public static final String RESET_AUTO_INCREMENT_USER_QUERY = "ALTER TABLE utilisateur AUTO_INCREMENT = 1";
	
	public static final String GET_USER_QUERY = "SELECT * FROM utilisateur WHERE nom = ?";
	
	
	// Publication
	public static final String CREATE_PUBLICATION_QUERY = "INSERT INTO publication (auteur,datePublication,titre,ID_User) VALUES (?,?,?,?)";
	public static final String RESET_AUTO_INCREMENT_PUBLICATION_QUERY = "ALTER TABLE publication AUTO_INCREMENT = 1";
	
	public static final String GET_ALL_PUBLICATION_TO_ONE_QUERY = "SELECT * FROM publication WHERE Auteur = ?";
	public static final String GET_ONE_PUBLICATION ="SELECT*FROM publication WHERE ID_publication = ?";
	
	public static final String UPDATE_PUBLICATION_QUERY = "UPDATE publication SET datePublication = CURDATE() WHERE ID_publication = ?";
	
	public static final String COUNT_PUBLICATION_TO_QUERY = "SELECT COUNT(*) FROM publication WHERE ID_User = ?";

	public static final String DELETE_ONE_PUBLICATION_QUERY = "DELETE FROM publication WHERE ID_publication = ?";
	public static final String DELETE_ALL_PUBLICATION_QUERY = "DELETE FROM publication";

}
