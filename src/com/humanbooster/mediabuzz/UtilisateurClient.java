package com.humanbooster.mediabuzz;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.log4j.PropertyConfigurator;

import com.humanbooster.mediabuzz.business.Utilisateur;
import com.humanbooster.mediabuzz.dao.impl.UtilisateurDaoImpl;
import com.humanbooster.mediabuzz.utils.Consts;
import com.humanbooster.mediabuzz.utils.DataConnect;

public class UtilisateurClient {

	public static void main(String[] args) {

		String log4jConfPath = Consts.LOG4J_CONF_PATH;
		PropertyConfigurator.configure(log4jConfPath);

		Connection connection = null;
		
		try {
			
			connection = DataConnect.getConnection();
			UtilisateurDaoImpl uDaoImpl = new UtilisateurDaoImpl(connection);
			Utilisateur u = new Utilisateur(1,"test3","mail3","motDePasse");
			// ------------- zone de tests standard ---------------- \\
			
			System.out.println("----------TEST Connection---------");
			System.out.println(" connexion : " + connection + " \n");

			System.out.println("----------TEST create-------------");
			System.out.println(uDaoImpl.createUser(u));
			System.out.println(u);
			System.out.println("----------TEST get----------------");
			System.out.println(uDaoImpl.getUser(1));
			System.out.println("----------TEST insert-------------");

			System.out.println("----------TEST update-------------");

			System.out.println("----------TEST count*--------------");

			System.out.println("----------TEST deleteOne----------");

			System.out.println("----------TEST deleteAll----------");
			System.out.println(uDaoImpl.deleteAllUser());

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally { 
			DataConnect.closeConnection(connection);
		}
		
	}

}
