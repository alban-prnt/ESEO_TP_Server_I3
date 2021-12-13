package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.blo.VilleBLO;
import com.dto.Ville;

@RestController
public class VilleController {

	
	@Autowired
	VilleBLO villeService;
	
	// Requete GET
	@RequestMapping(value = "/ville", method = RequestMethod.GET)
	@ResponseBody
	public ArrayList<Ville> appelGet(@RequestParam(required=false, value="codeCommune") String codePostal ) {
		
		System.out.println("Appel Get");
		ArrayList<Ville> villesListe = villeService.getInfoVilles(codePostal);

		return villesListe;
		
	}
	
	// Requete POST
	@RequestMapping(value = "/ville", method = RequestMethod.POST)
	@ResponseBody
	public boolean appelPost(@RequestBody Ville ville) {
		
		System.out.println("Appel POST");
		boolean villePost = villeService.getInfoVillePost(ville);
		
		return villePost;
	}
	
	// Requete PUT
	@RequestMapping(value = "/ville", method = RequestMethod.PUT)
	@ResponseBody
	public boolean appelPut(@RequestBody Ville ville) {
		
		System.out.println("Appel PUT");
		boolean villePut = villeService.getInfoVillePut(ville);
		
		return villePut;
	}
	
	
	// Requete DELETE
	@RequestMapping(value = "/ville", method = RequestMethod.DELETE)
	@ResponseBody
	public boolean appelDelete(@RequestBody Ville ville) {
		
		System.out.println("Appel DELETE");
		boolean villeDelete = villeService.getInfoVilleDelete(ville);
		
		return villeDelete;
	}
}
