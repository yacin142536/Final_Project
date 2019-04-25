package com.DAO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.adaming.DAO.IClientDao;
import com.adaming.model.Client;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientDaoImplTest {
	


	    private static final Logger LOGGER = LoggerFactory.getLogger(ClientDaoImplTest.class);
	    
	    @Autowired
	   private IClientDao clientDao;
	    
	    
	    @Test
	    public void givenEntityRepository_whenSaving(){
	        LOGGER.info("------------- Testing givenEntityRepository_whenSaving Method---------");
	        Client addedClient = clientDao.save(new Client(10,"dalii"));
	        LOGGER.info("------------Utilisateur saved-----------");
	        LOGGER.info("------------Searching for Utilisateur------------------");
	        Client foundClient = clientDao.findByIdClient(addedClient.getIdClient());
	        LOGGER.info("-------------Utilisateur found-----------");
	        LOGGER.info("-----------------Verifying Utilisateur----------");
	        assertNotNull(foundClient);
	        assertEquals(addedClient.getNom(), foundClient.getNom());
	        LOGGER.info("-------------- Utilisateur verified----------------------");
	    }
	    
	    @Test
	    public void givenEntityRepository_whenUpdating() {
	        LOGGER.info("------------- Testing givenEntityRepository_whenUpdating Method---------");
	        Client updatedClient = clientDao.save(new Client(11,"Jhonny"));
	        LOGGER.info("------------Utilisateur saved-----------");
	        
	        LOGGER.info("------------Update Utilisateur------------------");
	        updatedClient.setNom("Bill");
	        clientDao.save(updatedClient);
	        LOGGER.info("-------------Utilisateur updated-----------");
	        
	        LOGGER.info("------------Searching for Utilisateur------------------");
	        Client foundClient = clientDao.findByIdClient(updatedClient.getIdClient());
	        LOGGER.info("-------------Utilisateur found-----------");
	         
	        LOGGER.info("-----------------Verifying Utilisateur----------");
	        assertEquals(updatedClient.getNom(), foundClient.getNom());
	        LOGGER.info("-------------- Utilisateur verified----------------------");
	    }
	    
	    @Test
	    public void givenEntityRepository_whenDeleting() {
	        LOGGER.info("------------- Testing givenEntityRepository_whenDeleting Method---------");
	        Client deletedClient = clientDao.save(new Client(12,"Mo"));
	        LOGGER.info("------------Utilisateur saved-----------");
	        
	        LOGGER.info("------------Delete Utilisateur------------------");
	        clientDao.delete(deletedClient);
	        LOGGER.info("-------------Utilisateur deleted-----------");
	        
	        LOGGER.info("------------Searching for Utilisateur------------------");
	        Client foundClient = clientDao.findByIdClient(deletedClient.getIdClient());
	        LOGGER.info("-------------Utilisateur found-----------");
	            
	        LOGGER.info("-----------------Verifying Utilisateur----------");
	        assertNull(foundClient);
	        LOGGER.info("-------------- Utilisateur verified----------------------");
	        
	    }
	    
	    @Test
	    public void givenEntityRepository_whenRetrievingOneById() {
	        LOGGER.info("------------- Testing givenEntityRepository_whenRetrievingOneById Method---------");
	        
	        Client findByIdClient = clientDao.save(new Client(15,"Mado"));
	        LOGGER.info("------------Utilisateur saved-----------");
	        
	        LOGGER.info("------------Searching for Utilisateur------------------");
	        
	        Client foundClient = clientDao.findByIdClient(findByIdClient.getIdClient());
	        LOGGER.info("-------------Utilisateur found-----------");
	        
	        LOGGER.info("-----------------Verifying Utilisateur----------");
	        assertEquals(findByIdClient.getNom(), foundClient.getNom());
	        LOGGER.info("-------------- Utilisateur verified----------------------");
	    }
	    
	}
	
	


