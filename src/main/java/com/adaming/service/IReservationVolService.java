package com.adaming.service;



import java.util.List;

import com.adaming.model.ReservationVol;


public interface IReservationVolService {
	
public ReservationVol save(ReservationVol ResVol);
	
	public ReservationVol update(ReservationVol ResVol);
	
	public void delete(ReservationVol ResVol);
	
	public ReservationVol findById(Integer id);
	
	public List<ReservationVol> findAll();
	

	
	

	
}
