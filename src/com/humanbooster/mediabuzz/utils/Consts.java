package com.humanbooster.mediabuzz.utils;

public final class Consts {
	
	public static final String LOG4J_CONF_PATH = "C:\\Formation\\Java\\workspace\\MEDIABUZZ\\resources\\log4j.properties";
	
	public static final String CREATE_USER_QUERY = "INSERT INTO Utilisateur (nom, mail, mdp, dateInscription, compteActif) VALUES (?,?,?,?,?)";
	public static final String DELETE_ALL_USER_QUERY = "DELETE FROM utilisateur";
	public static final String RESET_AUTO_INCREMENT_USER_QUERY = "ALTER TABLE utilisateur AUTO_INCREMENT = 1";
	
	public static final String GET_USER_QUERY = "SELECT * FROM utilisateur WHERE ID_user = ?";
}
