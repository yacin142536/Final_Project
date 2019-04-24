package com.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ReservationNavette {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_transport")
	private int idTransport;
	
	private String heureDepart;
	private String heureArrivee;
	
	public ReservationNavette() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ReservationNavette(int idTransport, String heureDepart, String heureArrivee) {
		super();
		this.idTransport = idTransport;
		this.heureDepart = heureDepart;
		this.heureArrivee = heureArrivee;
	}
	
	public int getIdTransport() {
		return idTransport;
	}
	public void setIdTransport(int idTransport) {
		this.idTransport = idTransport;
	}
	public String getHeureDepart() {
		return heureDepart;
	}
	public void setHeureDepart(String heureDepart) {
		this.heureDepart = heureDepart;
	}
	public String getHeureArrivee() {
		return heureArrivee;
	}
	public void setHeureArrivee(String heureArrivee) {
		this.heureArrivee = heureArrivee;
	}
	
	@Override
	public String toString() {
		return "ReservationNavette [idTransport=" + idTransport + ", heureDepart=" + heureDepart + ", heureArrivee="
				+ heureArrivee + "]";
	}
	
	

}
