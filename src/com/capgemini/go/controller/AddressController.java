package com.capgemini.go.controller;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.HashMap;

import com.capgemini.exception.addressNotFoundException;
import com.capgemini.go.dto.AddressDTO;
import com.capgemini.go.service.AddressService;
import com.capgemini.go.service.AddressServiceImpl;

public class AddressController {
	public AddressController(){
		Map<String, AddressDTO> addressList = new HashMap<>();
		AddressService obj = new AddressServiceImpl();
		Scanner in = new Scanner(System.in);
		{
			boolean y = true;
			do {
				System.out.println("Welcome to Address Management System ");
				System.out.println("=======================================");
				System.out.println("1.View All Address");
				System.out.println("2.Add Address");
				System.out.println("3.Update Address");
				System.out.println("4.Delete Address");
				System.out.println("5.Exit");
				System.out.println("Please Enter Your Choice");

				int day = in.nextInt();

				switch (day) {
				case 1: // To get all the Address

					addressList = obj.viewAllAddress();
					if (addressList != null) {

						Iterator<Map.Entry<String, AddressDTO>> itr = addressList.entrySet().iterator();

						while (itr.hasNext()) {
							Entry<String, AddressDTO> entry = itr.next();
							System.out.println("Key = " + entry.getKey() + " " + entry.getValue());
						}

					} else {
						System.out.println("no address added");
					}
					break;
				case 2: // adding address

					System.out.println(
							"please provide the required address fields," + " buildingno, city, state, field, zip");
					AddressDTO Addobj = new AddressDTO();
					System.out.println("Enter buildingNo");
					Addobj.setBuildingNo(in.next());
					System.out.println(" Enter city");
					Addobj.setCity(in.next());
					System.out.println(" Enter state");
					Addobj.setState(in.next());
					System.out.println(" Enter field");
					Addobj.setField(in.next());
					System.out.println(" Enter zip");
					Addobj.setZip(in.next());
					try {
						obj.addAddress(Addobj);
					} catch (addressNotFoundException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
						//e.printStackTrace();
					}
					System.out.println("Address added");
					break;
				case 3: // For Updating Address

					System.out.println("Please enter the key value Address where you want to Update Address");
					String keyId = in.next();

					System.out.println(
							"Please provide the required address fields," + " buildingNo, city, state, field, Zip");
					AddressDTO updobj = new AddressDTO();
					System.out.println("please enter buildingNo");
					updobj.setBuildingNo(in.next());
					System.out.println("please enter city");
					updobj.setCity(in.next());
					System.out.println("please enter state");
					updobj.setState(in.next());
					System.out.println("please enter field");
					updobj.setField(in.next());
					System.out.println("please provide zip");
					updobj.setZip(in.next());

					obj.updateAddress(keyId, updobj);

					System.out.println("Address added");
					break;
				case 4: // For deleting address

					System.out.println("Select the key value you want to delete address for : ");
					String key = in.next();
					obj.deleteAddress(key);

					break;

				case 5: // Exiting from switch case as well as main

					obj.toExit();
					break;

				default:
					System.out.println("Incorrect Input");
					break;
				}
				System.out.println("Want to process more?  y/n");
				String x = in.next();
				char ch = x.charAt(0);
				if (ch == 'n')
					y = false;

			} while (y != false);
			System.out.println("Thank you!!!");
			in.close();

	}
	}

	public static void main(String[] args) {
		new AddressController();
	}

}
