package com.dlv.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

import com.dlv.UserService;
import com.dlv.repo.UserDao;

public class UserServiceTest {
	
	@Test
	public void getNameTest() {
		
		// creating mock object
		UserDao userDaomock = PowerMockito.mock(UserDao.class);
		
		// defining mock obj behavior
		PowerMockito.when(userDaomock.findNameById(101)).thenReturn("Raju");
		
		// injecting mock obj into service obj
		UserService service = new UserService(userDaomock);
		
		String name = service.getName(101);
		
		String expectedName="Raju";
		
		assertEquals(expectedName, name);
		
		
	}

}
