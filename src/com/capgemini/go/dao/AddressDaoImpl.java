package com.capgemini.go.dao;

import java.util.Map;

import org.apache.log4j.Logger;

import com.capgemini.go.dto.AddressDTO;

public class AddressDaoImpl implements AddressDao {
	private Logger logger = Logger.getLogger(AddressDaoImpl.class);


	@Override
	public boolean addAddress(AddressDTO address) {
		logger.info("Address added :" + address);
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAddress(AddressDTO address) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAddress(String key) {
		logger.info("Address Deleted:" + key);
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<String, AddressDTO> viewAllAddress() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

	
}