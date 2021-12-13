package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOFactory {
    private String url;
    private String username;
    private String password;

    DAOFactory(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public static DAOFactory getInstance() {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {

        }

        DAOFactory instance = new DAOFactory(
                "jdbc:h2:tcp://localhost/~/test", "sa", "");
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    // Récupération du Dao
    public VilleDAO getUtilisateurDao() {
        return new VilleDAOImpl();
    }
}