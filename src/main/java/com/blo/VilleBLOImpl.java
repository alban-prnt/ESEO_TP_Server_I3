package com.blo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.VilleDAO;
import com.dto.Ville;

@Service
public class VilleBLOImpl implements VilleBLO{
	
	@Autowired
	private VilleDAO villeDAO;
	
	@Override
	public ArrayList<Ville> getInfoVilles(String ville) {
		return villeDAO.findVille(ville);
		
	}

	@Override
	public boolean getInfoVillePost(Ville ville) {
		
		
		return villeDAO.postVille(ville);
	}
	
	@Override
	public boolean getInfoVillePut(Ville ville) {
		
		
		return villeDAO.putVille(ville);
	}
	
	@Override
	public boolean getInfoVilleDelete(Ville ville) {
		
		
		return  villeDAO.deleteVille(ville);
	}
	
}
