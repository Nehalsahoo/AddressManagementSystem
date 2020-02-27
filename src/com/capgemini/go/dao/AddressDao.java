package com.capgemini.go.dao;

import java.util.Map;

import com.capgemini.go.dto.AddressDTO;

public interface AddressDao {
	
	public Map<String, AddressDTO> viewAllAddress();
	
	boolean addAddress(AddressDTO address);

	boolean updateAddress(AddressDTO address);

	boolean deleteAddress(String key);

}
