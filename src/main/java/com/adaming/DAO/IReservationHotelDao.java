package com.adaming.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.model.ReservationHotel;

@Repository
public interface IReservationHotelDao extends JpaRepository<ReservationHotel, Integer>  {
	

}
