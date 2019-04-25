package com.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.adaming.DAO.IClientDao;
import com.adaming.model.Client;
import com.adaming.service.impl.IClientServiceImpl;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientServiceImplTest {
	
	@RunWith(SpringRunner.class)
	@SpringBootTest
	public class UserServiceImplTest {
		
		
		private IClientServiceImpl clientService;
		private final Logger LOGGER = LoggerFactory.getLogger(ClientServiceImplTest.class);

		@Mock
		private IClientDao clientRepository;

		@Before
		public void setUp() {
			MockitoAnnotations.initMocks(this);
			clientService = new IClientServiceImpl((IClientServiceImpl) clientRepository);
		}

		@Test
		public void should_store_when_save_is_called() {
			LOGGER.info("--------------- Executing should_store_when_save_is_called test Of UserServiceImplTest ---------------");
			Client myClient = new Client();
			clientService.save(myClient);
			Mockito.verify(clientRepository).save(myClient);
		}
		
		@Test
		public void should_update_when_update_is_called() {
			LOGGER.info("--------------- Executing should_update_when_update_is_called test Of UserServiceImplTest ---------------");
			Client myClient = new Client();
			clientService.update(myClient);
			Mockito.verify(clientRepository).save(myClient);
		}
		
		@Test
		public void should_delete_when_delete_is_called() {
			LOGGER.info("--------------- Executing should_delete_when_delete_is_called test Of UserServiceImplTest ---------------");
			Client myClient = new Client();
			clientService.delete(myClient);
			Mockito.verify(clientRepository).delete(myClient);
		}
		
		@Test
		public void should_search_by_id_when_findById_is_called() {
			LOGGER.info("--------------- Executing should_search_by_id_when_findById_is_called test Of UserServiceImplTest ---------------");
			Integer id = new Integer(1);
			clientService.findById(id);
			Mockito.verify(clientRepository).findByIdClient(id);
		}
		
		@Test
		public void should_search_all_when_findAll_is_called() {
			LOGGER.info("--------------- Executing should_search_all_when_findAll_is_called test Of UserServiceImplTest ---------------");
			clientService.findAll();
			Mockito.verify(clientRepository).findAll();
		}

}
}
