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
			UtilisateurDaoImpl uDaoImpl = new UtilisateurDaoImpl(connection);
			Publication pub = new Publication(u,"Premi�reProduction");
			Publication pub2 = new Publication(u,"Deuxi�meProduction");
			PublicationDaoImpl pDaoImpl = new PublicationDaoImpl(connection);
			// ------------- zone de tests standard ---------------- \\

			System.out.println("----------TEST Connection---------");
			System.out.println(" connexion : " + connection + " \n");

			System.out.println("----------TEST create-------------");
			System.out.println(uDaoImpl.createUser(u));
			System.out.println(pDaoImpl.createPublication(pub));
			System.out.println(pDaoImpl.createPublication(pub2));
			System.out.println(pub);
			System.out.println(pub2);
			System.out.println("----------TEST get----------------");
			for(Publication liste : pDaoImpl.getPublication("test"))
				System.out.println(liste);
			System.out.println("----------TEST insert-------------");

			System.out.println("----------TEST update-------------");

			System.out.println("----------TEST count*--------------");

			System.out.println("----------TEST deleteOne----------");

			System.out.println("----------TEST deleteAll----------");
			System.out.println(uDaoImpl.deleteAllUser());
			System.out.println(pDaoImpl.deleteAllPublication());

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			DataConnect.closeConnection(connection);
		}

	}

}
