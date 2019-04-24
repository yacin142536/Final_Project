package com.adaming.service;



import java.util.List;

import com.adaming.model.ReservationHotel;



public interface IReservationService {
	
	public List<ReservationHotel> getAllReservationHotel();

	public ReservationHotel addReservationHotel();
	
	public ReservationHotel updateReservationHotel();
	
	public ReservationHotel deleteReservationHotel();
	
	public ReservationHotel afficherReservationHotel();
	
	

	
}
