package com.capgemini.go.service;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.exception.addressNotFoundException;
import com.capgemini.go.dao.AddressDao;
import com.capgemini.go.dao.AddressDaoImpl;
import com.capgemini.go.dto.AddressDTO;

public class AddressServiceImpl implements AddressService {

	Map<String, AddressDTO> addressList = new HashMap<>();
	AddressDao ob = new AddressDaoImpl();

	public AddressServiceImpl() {
		super();
		setAddress();
	}

	public Map<String, AddressDTO> viewAllAddress() {

		return addressList;
	}

	private void setAddress() {
		addressList.put("1 ", new AddressDTO("25 ", " Rourkela", "Odisha", "Field1", "769004"));
		addressList.put("2 ", new AddressDTO("26 ", "Sundergarh", "Odisha", "field2", "769005"));
		
	}
	
	public boolean addAddress(AddressDTO address) throws addressNotFoundException {
		if (address != null) {
			addressList.put(address.getAddressId(), address);
			viewAllAddress();
		}
		boolean re = ob.addAddress(address);
		if(re==false) {
			throw new addressNotFoundException("Address not found");
		}
		return re;

	}

	public boolean updateAddress(String keyId, AddressDTO address) {

		if (addressList != null) {
			addressList.put(String.valueOf(keyId), address);

			System.out.println("address " + addressList + " has been replaced on the address database");
		} else {
			System.out.println("Specified address not found");
		}
		return ob.updateAddress(address);

	}

	public boolean deleteAddress(String key) {
		if (String.valueOf(addressList).contains(key)) {
			addressList.remove(key);
			System.out.println("Address Deleted Successfully at " + key + " value ");
		} else {
			System.out.println("please enter the valid key");
		}
		return ob.deleteAddress(key);

	}

	public void toExit() {

		System.out.print("See you soon :-) ");
		System.exit(0);
	}

	@Override
	public void AddressServiceImpl() {
		// TODO Auto-generated method stub
		
	}

	

}
