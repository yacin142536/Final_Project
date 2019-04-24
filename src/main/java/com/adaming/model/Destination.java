package com.adaming.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Destination {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_pays")
	private int idPay;
	
	@Column(name="nom_pays")
	private String nomPays;
	
	@Column(name="code_postale")
	private int codePostale;

	
	private List<ReservationHotel> listHotels;

	public Destination() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Destination(int idPay, String nomPays, int codePostale, List<ReservationHotel> listHotels) {
		super();
		this.idPay = idPay;
		this.nomPays = nomPays;
		this.codePostale = codePostale;
		this.listHotels = listHotels;
	}

	public int getIdPay() {
		return idPay;
	}

	public void setIdPay(int idPay) {
		this.idPay = idPay;
	}

	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	public int getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}

	public List<ReservationHotel> getListHotels() {
		return listHotels;
	}

	public void setListHotels(List<ReservationHotel> listHotels) {
		this.listHotels = listHotels;
	}

	@Override
	public String toString() {
		return "Pays [idPay=" + idPay + ", nomPays=" + nomPays + ", codePostale=" + codePostale + ", listHotels="
				+ listHotels + "]";
	}
	
	
	
	

}
