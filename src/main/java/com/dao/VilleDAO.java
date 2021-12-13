package com.dao;

import java.util.ArrayList;

import com.dto.Ville;

public interface VilleDAO {
	
	ArrayList<Ville> findVille(String ville);
	
	public boolean postVille(Ville ville);
	
	public boolean putVille(Ville ville);
	
	public boolean deleteVille(Ville ville);


}
