package com.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ville {
	
	public String code_commune_INSEE;
	public String nom_commune;
	public String code_postal;
	public String libelle_acheminement;
	public String ligne_5;
	public String latitude;
	public String longitude;
	
	public String getCodeCommune() {
		return code_commune_INSEE;
	}

	public void setCodeCommune(String codeCommune) {
		this.code_commune_INSEE = codeCommune;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}


	public String getNomCommune() {
		return nom_commune;
	}

	public void setNomCommune(String nomCommune) {
		this.nom_commune = nomCommune;
	}

	public String getCodePostal() {
		return code_postal;
	}

	public void setCodePostal(String codePostal) {
		this.code_postal = codePostal;
	}

	public String getLibelleAcheminement() {
		return libelle_acheminement;
	}

	public void setLibelleAcheminement(String libelleAcheminement) {
		this.libelle_acheminement = libelleAcheminement;
	}

	public String getLigne() {
		return ligne_5;
	}

	public void setLigne(String ligne) {
		this.ligne_5 = ligne;
	}

}