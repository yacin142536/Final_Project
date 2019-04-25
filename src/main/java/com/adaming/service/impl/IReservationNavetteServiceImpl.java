package com.adaming.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.DAO.IReservationNavetteDao;
import com.adaming.model.ReservationNavette;
import com.adaming.service.IReservationNavetteService;

@Service
public class IReservationNavetteServiceImpl implements IReservationNavetteService{
	
	@Autowired
	IReservationNavetteDao navRepository;
	
	public IReservationNavetteServiceImpl(IReservationNavetteServiceImpl resNav) {
		this.navRepository = navRepository;
	}

	@Override
	public ReservationNavette save(ReservationNavette resNav) {
		return navRepository.save(resNav);
	}

	@Override
	public ReservationNavette update(ReservationNavette resNav) {
		return navRepository.save(resNav);
	}

	@Override
	public void delete(ReservationNavette resNav) {
		navRepository.delete(resNav);
		
	}

	@Override
	public ReservationNavette findById(Integer id) {
		return navRepository.findById(id).orElse(null);
	}

	@Override
	public List<ReservationNavette> findAll() {
		return navRepository.findAll();
	}

}
