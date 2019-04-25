package com.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ReservationHotel extends Hotel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_hotel")
	private int idHotel;

	private String dateEntre;
	
	private String dateSortie;
	
	@OneToOne(fetch=FetchType.LAZY, mappedBy="id_hotel")
	private ReservationVol reservationVol;

	public ReservationHotel() {
		super();
		
	}

	public ReservationHotel(int idHotel, String dateEntre, String dateSortie) {
		super();
		this.idHotel = idHotel;
		this.dateEntre = dateEntre;
		this.dateSortie = dateSortie;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public String getDateEntre() {
		return dateEntre;
	}

	public void setDateEntre(String dateEntre) {
		this.dateEntre = dateEntre;
	}

	public String getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(String dateSortie) {
		this.dateSortie = dateSortie;
	}

	@Override
	public String toString() {
		return "ReservationHotel [idHotel=" + idHotel + ", dateEntre=" + dateEntre + ", dateSortie=" + dateSortie + "]";
	}
	
	
}