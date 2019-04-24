package com.adaming.DAO;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.qos.logback.core.net.server.Client;


@Repository
public interface IClientDao extends JpaRepository<Client, Integer> {
	
	public Client findById(long id);
	
	public Client addClient();
	
	public Client updateClient();
	
	public Client deleteCLient();
	

	
}

