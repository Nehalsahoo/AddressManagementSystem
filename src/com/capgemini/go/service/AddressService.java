package com.capgemini.go.service;

import java.util.Map;

import com.capgemini.exception.addressNotFoundException;
import com.capgemini.go.dto.AddressDTO;

public interface AddressService {
	
	public Map<String, AddressDTO> viewAllAddress();
	public boolean addAddress(AddressDTO address) throws addressNotFoundException;
	public boolean updateAddress(String keyId,AddressDTO address);
	public boolean deleteAddress(String key);
	public void AddressServiceImpl();
	public void toExit();
}
