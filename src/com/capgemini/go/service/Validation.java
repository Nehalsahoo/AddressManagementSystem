package com.capgemini.go.service;

public class Validation {

	AddressServiceImpl sc = new AddressServiceImpl();
	public boolean validateupdateAddress( String address) 
	{
		if(!address.matches("[a-z,A-Z,0-9,\\\\s]*"))
		{
			System.out.println("\n*Note: address should not be blank");
			return false;
		}
		return false;
		
		
		
	
}
}