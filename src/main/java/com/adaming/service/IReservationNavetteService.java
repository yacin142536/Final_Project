package com.adaming.service;



import java.util.List;

import com.adaming.model.ReservationNavette;


public interface IReservationNavetteService {
	
public ReservationNavette save(ReservationNavette ResNav);
	
	public ReservationNavette update(ReservationNavette ResNav);
	
	public void delete(ReservationNavette ResNav);
	
	public ReservationNavette findById(Integer id);
	
	public List<ReservationNavette> findAll();
	

	
	

	
}
