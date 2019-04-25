package com.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ReservationVol {
	
	@Id
	@Column(name="id_reservation")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idReservation;
	
	@Column(name="date_aller")
	private int dateAller;
	
	@Column(name="date_retour")
	private int dateRetour;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_hotel")
	private  ReservationHotel reservationHotel;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_transport")
	private  ReservationNavette reservationNavette;
	
	private int prixVoyage;
	
	public ReservationVol() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ReservationVol(int idReservation, int dateAller, int dateRetour, ReservationHotel reservationHotel,
			ReservationNavette reservationNavette, int prixVoyage) {
		super();
		this.idReservation = idReservation;
		this.dateAller = dateAller;
		this.dateRetour = dateRetour;
		this.reservationHotel = reservationHotel;
		this.reservationNavette = reservationNavette;
		this.prixVoyage = prixVoyage;
	}
	
	public int getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}
	public int getDateAller() {
		return dateAller;
	}
	public void setDateAller(int dateAller) {
		this.dateAller = dateAller;
	}
	public int getDateRetour() {
		return dateRetour;
	}
	public void setDateRetour(int dateRetour) {
		this.dateRetour = dateRetour;
	}
	public ReservationHotel getReservationHotel() {
		return reservationHotel;
	}
	public void setReservationHotel(ReservationHotel reservationHotel) {
		this.reservationHotel = reservationHotel;
	}
	public ReservationNavette getReservationNavette() {
		return reservationNavette;
	}
	public void setReservationNavette(ReservationNavette reservationNavette) {
		this.reservationNavette = reservationNavette;
	}
	public int getPrixVoyage() {
		return prixVoyage;
	}
	public void setPrixVoyage(int prixVoyage) {
		this.prixVoyage = prixVoyage;
	}
	
	@Override
	public String toString() {
		return "ReservationVol [idReservation=" + idReservation + ", dateAller=" + dateAller + ", dateRetour="
				+ dateRetour + ", reservationHotel=" + reservationHotel + ", reservationNavette=" + reservationNavette
				+ ", prixVoyage=" + prixVoyage + "]";
	}
	
	
}
