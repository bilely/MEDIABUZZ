package com.humanbooster.mediabuzz;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.log4j.PropertyConfigurator;

import com.humanbooster.mediabuzz.utils.Consts;
import com.humanbooster.mediabuzz.utils.DataConnect;

public class UtilisateurClient {

	public static void main(String[] args) {

		String log4jConfPath = Consts.LOG4J_CONF_PATH;
		PropertyConfigurator.configure(log4jConfPath);

		Connection connection = null;
		
		try {
			
			connection = DataConnect.getConnection();
			
			// ------------- zone de tests standard ---------------- \\
			
			System.out.println("----------TEST Connection---------");
			System.out.println(" connexion : " + connection + " \n");

			System.out.println("----------TEST create-------------");

			System.out.println("----------TEST get----------------");

			System.out.println("----------TEST insert-------------");

			System.out.println("----------TEST update-------------");

			System.out.println("----------TEST cont*--------------");

			System.out.println("----------TEST deleteOne----------");

			System.out.println("----------TEST deleteOne----------");

			System.out.println("----------TEST deleteAll----------");

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally { 
			DataConnect.closeConnection(connection);
		}
		
	}

}
