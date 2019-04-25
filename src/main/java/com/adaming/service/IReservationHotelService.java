package com.adaming.service;



import java.util.List;

import com.adaming.model.ReservationHotel;


public interface IReservationHotelService {
	
	public ReservationHotel save(ReservationHotel ResHotel);
	
	public ReservationHotel update(ReservationHotel ResHotel);
	
	public void delete(ReservationHotel ResHotel);
	
	public ReservationHotel findById(Integer id);
	
	public List<ReservationHotel> findAll();
	

	
	

	
}
