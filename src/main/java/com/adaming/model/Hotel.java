package com.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_hotel")
	private int idHotel;
	
	@Column(name="nom_hotel")
	private String nomHotel;
	
	@Column(name="adresse_hotel")
	private String  adresseHotel;
	
	private String ville;
	
	@Column(name="prix_par_nuit")
	private int prixNuit;

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(int idHotel, String nomHotel, String adresseHotel, String ville, int prixNuit) {
		super();
		this.idHotel = idHotel;
		this.nomHotel = nomHotel;
		this.adresseHotel = adresseHotel;
		this.ville = ville;
		this.prixNuit = prixNuit;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public String getNomHotel() {
		return nomHotel;
	}

	public void setNomHotel(String nomHotel) {
		this.nomHotel = nomHotel;
	}

	public String getAdresseHotel() {
		return adresseHotel;
	}

	public void setAdresseHotel(String adresseHotel) {
		this.adresseHotel = adresseHotel;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getPrixNuit() {
		return prixNuit;
	}

	public void setPrixNuit(int prixNuit) {
		this.prixNuit = prixNuit;
	}

	@Override
	public String toString() {
		return "Hotel [idHotel=" + idHotel + ", nomHotel=" + nomHotel + ", adresseHotel=" + adresseHotel + ", ville="
				+ ville + ", prixNuit=" + prixNuit + "]";
	}
	
	
	

}
