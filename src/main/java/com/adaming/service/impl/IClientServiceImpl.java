package com.adaming.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.DAO.IClientDao;
import com.adaming.model.Client;
import com.adaming.service.IClientService;

@Service
public class IClientServiceImpl implements IClientService{
	
	@Autowired
	IClientDao clientRepository;
	
	public IClientServiceImpl(IClientServiceImpl clientService) {
		this.clientRepository = clientRepository;
	}

	@Override
	public Client save(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public Client update(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public void delete(Client client) {
		clientRepository.delete(client);
		
	}

	@Override
	public Client findById(Integer id) {
		return clientRepository.findById(id).orElse(null);
	}

	@Override
	public List<Client> findAll() {
		return clientRepository.findAll();
	}

}
