package com.capgemini.test;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.exception.addressNotFoundException;
import com.capgemini.go.dto.AddressDTO;
import com.capgemini.go.service.AddressServiceImpl;

public class daoTest {
	private static AddressServiceImpl test;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		test = new AddressServiceImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testviewAllAddress() {
		Map<String, AddressDTO> result = test.viewAllAddress();
		assertNotNull(result);
	}
	@Test
	public void testAddAddress() {
		
		boolean result;
		try {
			result = test.addAddress(new AddressDTO("string", "string", "string", "string", "string"));
			assertTrue(result);
		} catch (addressNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}

}
