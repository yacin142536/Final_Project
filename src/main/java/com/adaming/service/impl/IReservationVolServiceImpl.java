package com.adaming.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.DAO.IReservationVolDao;
import com.adaming.model.ReservationVol;
import com.adaming.service.IReservationVolService;

@Service
public class IReservationVolServiceImpl implements IReservationVolService {
	
	@Autowired
	IReservationVolDao volRepository;
	
	public IReservationVolServiceImpl(IReservationVolServiceImpl resVol) {
		this.volRepository = volRepository;
	}

	@Override
	public ReservationVol save(ReservationVol resVol) {
		return volRepository.save(resVol);
	}

	@Override
	public ReservationVol update(ReservationVol resVol) {
		return volRepository.save(resVol);
	}

	@Override
	public void delete(ReservationVol resVol) {
		volRepository.delete(resVol);
		
	}

	@Override
	public ReservationVol findById(Integer id) {
		return volRepository.findById(id).orElse(null);
	}

	@Override
	public List<ReservationVol> findAll() {
		return volRepository.findAll();
	}

}
