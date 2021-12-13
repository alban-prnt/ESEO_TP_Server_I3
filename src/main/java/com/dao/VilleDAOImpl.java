package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.config.JDBCConfiguration;
import com.dto.Ville;

@Repository
public class VilleDAOImpl implements VilleDAO {
	
	Connection con = DAOFactory.getConnection();
	
	@Override
	public ArrayList<Ville> findVille(String codeCommune) {
		ArrayList<Ville> villesListe = new ArrayList<Ville>();
		
		
		String requete;
		
		if (codeCommune == null) {
			requete = "SELECT * FROM ville_france";
		} else {
			requete = "SELECT * FROM ville_france WHERE code_commune_insee='" + codeCommune + "'";
		}
		
		try(Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(requete);) {	
            
            while ( rs.next() ) {
            	Ville ville = new Ville();
            	ville.setCodeCommune(rs.getString(1));
 			   	ville.setNomCommune(rs.getString(2));
 			   	ville.setCodePostal(rs.getString(3));
 			   	ville.setLibelleAcheminement(rs.getString(4));
 			   	ville.setLigne(rs.getString(5));
 			   	ville.setLatitude(rs.getString(6));
 			   	ville.setLongitude(rs.getString(7));
 			  
            	villesListe.add(ville);
                
            	System.out.println(rs.getString("Code_commune_INSEE"));
            }
            
		} 
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return villesListe;
		
	}
	
	public boolean postVille(Ville ville) {
		
		boolean villePost = false;
		String requete = "INSERT INTO ville_france (Code_commune_INSEE, Nom_commune, Code_postal, Libelle_acheminement, Ligne_5, Latitude, Longitude) VALUES ('" + ville.getCodeCommune() + "', '" + ville.getNomCommune() + "', '" + ville.getCodePostal() + "', '" + ville.getLibelleAcheminement() + "', '" + ville.getLibelleAcheminement() + "', '" + ville.getLatitude() + "', '" + ville.getLongitude() + "');";	
		
		System.out.println(requete);
		
		try {
			Statement stmt = con.createStatement();
			int rs = stmt.executeUpdate(requete);
			villePost = (rs > 0);
		
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return villePost;
	}
	
	public boolean putVille(Ville ville) {
		
		boolean villePut = false;
		String requete = "UPDATE ville_france SET Code_commune_INSEE = '" + ville.getCodeCommune() + "', Nom_commune = '" + ville.getNomCommune() + "', Code_postal = '" + ville.getCodePostal() + "', Libelle_acheminement = '" + ville.getLibelleAcheminement() + "', Ligne_5 = '" + ville.getLigne() + "', Latitude = '" + ville.getLatitude() + "', Longitude = '" + ville.getLongitude() + "' WHERE Code_commune_INSEE = '" + ville.getCodeCommune() + "';";

		try {
			Statement stmt = con.createStatement();
			int rs = stmt.executeUpdate(requete);
			villePut = (rs > 0);

		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return villePut;
	}
	
	public boolean deleteVille(Ville ville) {
		
		boolean villeDel = false;
		String requete = "DELETE FROM ville_france WHERE Code_commune_INSEE = '" + ville.getCodeCommune() + "';";

		try {
			Statement stmt = con.createStatement();
			int rs = stmt.executeUpdate(requete);
			villeDel = (rs > 0);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return villeDel;
	}
	
}
