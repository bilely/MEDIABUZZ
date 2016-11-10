package com.humanbooster.mediabuzz;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;

import com.humanbooster.mediabuzz.business.Publication;
import com.humanbooster.mediabuzz.business.Utilisateur;
import com.humanbooster.mediabuzz.dao.impl.PublicationDaoImpl;
import com.humanbooster.mediabuzz.dao.impl.UtilisateurDaoImpl;
import com.humanbooster.mediabuzz.utils.Consts;
import com.humanbooster.mediabuzz.utils.DataConnect;

public class PublicationClient {

	public static void main(String[] args) {
		String log4jConfPath = Consts.LOG4J_CONF_PATH;
		PropertyConfigurator.configure(log4jConfPath);

		Connection connection = null;

		try {

			connection = DataConnect.getConnection();
			Utilisateur u = new Utilisateur(1, "test", "mail@", "motDePasseRandom");
			Utilisateur u2 = new Utilisateur(2, "test2", "mail2@", "motDePasseRandom2");
			UtilisateurDaoImpl uDaoImpl = new UtilisateurDaoImpl(connection);
			Publication pub = new Publication(1,u,"PremièreProduction",1);
			Publication pub2 = new Publication(2,u,"DeuxièmeProduction",1);
			Publication pub3 = new Publication(3,u2,"TroisièmeProduction",2);
			PublicationDaoImpl pDaoImpl = new PublicationDaoImpl(connection);
			// ------------- zone de tests standard ---------------- \\

			System.out.println("----------TEST Connection---------");
			System.out.println(" connexion : " + connection + " \n");

			System.out.println("----------TEST create-------------");
			System.out.println("Création de m'utilisateur 1: "+uDaoImpl.createUser(u)+" "+u);
			System.out.println("Création de l'utilisateur 2: "+uDaoImpl.createUser(u2)+" "+u2);
			System.out.println("Création de la publication 1: "+pDaoImpl.createPublication(pub)+" = "+pub);
			System.out.println("Création de la publication 2: "+pDaoImpl.createPublication(pub2)+" = "+pub2);
			System.out.println("Création de la publication 3: "+pDaoImpl.createPublication(pub3)+" = "+pub3);
			System.out.println("----------TEST getAllPublication----------------");
			System.out.println("Voici la liste de toute les publication de "+u.getNom());
			for(Publication liste : pDaoImpl.getAllPublication(u))
			System.out.println(liste);
			System.out.println("----------TEST getOnePublication----------------");
			System.out.println("Voici la publication n°3 :"+pDaoImpl.getPublication(3));
			System.out.println("----------TEST insert-------------");
			List<Publication> publications = pDaoImpl.getAllPublication(u);
			System.out.println("Insertion de la liste de publication de "+u.getNom()+" nouvellement créée :"+pDaoImpl.insertAllPublication(publications));
			System.out.println("----------TEST update-------------");
			System.out.println("MAJ de la publication "+pub+" :"+pDaoImpl.updatePublication(pub));
			System.out.println("----------TEST deleteOne----------");
			System.out.println("Suppression de la publication numero 2 :"+pDaoImpl.deletePublication(2));
			System.out.println("----------TEST Count(*)-----------");
			System.out.println("Nombre de publication faite par "+u.getNom()+" enregistré :"+pDaoImpl.nbPublication(u));
			System.out.println("----------TEST deleteAll----------");
			System.out.println("Suppression des publications :"+pDaoImpl.deleteAllPublication());
			System.out.println("Suppression des utilisateurs :"+uDaoImpl.deleteAllUser());

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			DataConnect.closeConnection(connection);
		}

	}

}
