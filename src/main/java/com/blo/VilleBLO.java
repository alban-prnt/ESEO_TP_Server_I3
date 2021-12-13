package com.blo;

import java.util.ArrayList;

import com.dto.Ville;

public interface VilleBLO {
	
	public ArrayList<Ville> getInfoVilles(String ville);
	
	public boolean getInfoVillePost(Ville ville);
	
	public boolean getInfoVillePut(Ville ville);
	
	public boolean getInfoVilleDelete(Ville ville);

}
