package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.annotation.Bean;

public class DAOFactory {  
    @Bean
	public static Connection getConnection() {

		String url = "jdbc:h2:tcp://localhost/~/test";
		String user = "sa";
		String password = "";
		Connection connection = null;
		
		try {
		
            if(connection == null) {
            	connection = DriverManager.getConnection(url, user, password);
            }
		} catch (SQLException e1) {
			System.out.println("Erreur pendant la creation de la connexion à la BDD." + e1);
			e1.printStackTrace();
		}
		return connection;
	}
}