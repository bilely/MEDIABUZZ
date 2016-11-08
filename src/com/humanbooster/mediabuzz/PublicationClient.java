package com.humanbooster.mediabuzz;

import java.sql.Connection;
import java.sql.SQLException;

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
			Publication pub = new Publication(1,u,"PremièreProduction");
			Publication pub2 = new Publication(2,u,"DeuxièmeProduction");
			Publication pub3 = new Publication(3,u2,"TroisièmeProduction");
			PublicationDaoImpl pDaoImpl = new PublicationDaoImpl(connection);
			// ------------- zone de tests standard ---------------- \\

			System.out.println("----------TEST Connection---------");
			System.out.println(" connexion : " + connection + " \n");

			System.out.println("----------TEST create-------------");
			System.out.println(uDaoImpl.createUser(u));
			System.out.println(uDaoImpl.createUser(u2));
			System.out.println(pDaoImpl.createPublication(pub));
			System.out.println(pDaoImpl.createPublication(pub2));
			System.out.println(pDaoImpl.createPublication(pub3));
			System.out.println(pub);
			System.out.println(pub2);
			System.out.println(pub3);
			System.out.println("----------TEST getAllPublication----------------");
			for(Publication liste : pDaoImpl.getAllPublication("test"))
			System.out.println(liste);
			System.out.println("----------TEST getOnePublication----------------");
			System.out.println(pDaoImpl.getPublication(3));
			System.out.println("----------TEST insert-------------");

			System.out.println("----------TEST update-------------");
			System.out.println(pDaoImpl.updatePublication(pub));
			System.out.println("----------TEST deleteOne----------");
			System.out.println(pDaoImpl.deletePublication(3));
			System.out.println("----------TEST deleteAll----------");
			System.out.println(pDaoImpl.deleteAllPublication());
			System.out.println(uDaoImpl.deleteAllUser());

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			DataConnect.closeConnection(connection);
		}

	}

}
