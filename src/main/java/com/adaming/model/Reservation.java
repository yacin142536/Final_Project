package com.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservation {
	
	@Id
	@Column(name="id_reservation")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idReservation;
	
	private int dateDepart;
	private int dateArrivee;
	
	private int idReservationVol;
	private int idReservationHotel;
	private int idReservationNavette;
	private int prix;
	
	
	
	
}
