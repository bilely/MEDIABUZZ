package com.humanbooster.mediabuzz;

import java.sql.Connection;
import java.sql.SQLException;

import com.humanbooster.mediabuzz.utils.DataConnect;

public class App {

	public static void main(String[] args) {

		Connection connexion = null;

		try {

			connexion = DataConnect.getConnection();

			// ------------- zone de tests standard ---------------- \\
			
			System.out.println("----------TEST Connection---------");
			System.out.println(" connexion : " + connexion + " \n");

			System.out.println("----------TEST create-------------");

			System.out.println("----------TEST get----------------");

			System.out.println("----------TEST insert-------------");

			System.out.println("----------TEST update-------------");

			System.out.println("----------TEST cont*--------------");

			System.out.println("----------TEST deleteOne----------");

			System.out.println("----------TEST deleteOne----------");

			System.out.println("----------TEST deleteAll----------");

		} catch (SQLException |ClassNotFoundException e) {
			e.printStackTrace();
		} finally { 
			DataConnect.closeConnection(connexion);
		}

	}

}
