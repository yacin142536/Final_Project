package com.adaming.service;

import java.util.List;

import fr.adaming.model.Country;

public interface IReservationService  {

	public List<Reservation> getAllCountries();
	
	public Reservation getReservation(int id);
	
	public Country addCountry(Country country);
	
	public Country updateCountry(Country country);
	
	public void deleteCountry(int id);
	
	
}
