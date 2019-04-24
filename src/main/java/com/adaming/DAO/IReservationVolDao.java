package com.adaming.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.adaming.model.ReservationVol;

@Repository
public interface IReservationVolDao extends JpaRepository<ReservationVol, Integer> {
	
public ReservationVol findByIdReservation(int id);
	

}
