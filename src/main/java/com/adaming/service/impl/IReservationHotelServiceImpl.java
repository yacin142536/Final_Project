package com.adaming.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.DAO.IReservationHotelDao;
import com.adaming.model.ReservationHotel;
import com.adaming.service.IReservationHotelService;

@Service
public class IReservationHotelServiceImpl implements IReservationHotelService {

	@Autowired
	IReservationHotelDao hotelRepository;
	
	
	public IReservationHotelServiceImpl(IReservationHotelServiceImpl resHotel) {
		this.hotelRepository = hotelRepository;
	}

	@Override
	public ReservationHotel save(ReservationHotel resHotel) {
		return hotelRepository.save(resHotel);
	}

	@Override
	public ReservationHotel update(ReservationHotel resHotel) {
		return hotelRepository.save(resHotel);
	}

	@Override
	public void delete(ReservationHotel resHotel) {
		hotelRepository.delete(resHotel);
		
	}

	@Override
	public ReservationHotel findById(Integer id) {
		return hotelRepository.findById(id).orElse(null);
	}

	@Override
	public List<ReservationHotel> findAll() {
		return hotelRepository.findAll();
		
	}
}
