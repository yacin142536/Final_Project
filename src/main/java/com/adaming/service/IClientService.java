package com.adaming.service;

import java.util.List;

import com.adaming.model.Client;

public interface IClientService {
	
	public Client save(Client Client);
	
	public Client update(Client Client);
	
	public void delete(Client Client);
	
	public Client findById(Integer id);
	
	public List<Client> findAll();
	

	
	
}
