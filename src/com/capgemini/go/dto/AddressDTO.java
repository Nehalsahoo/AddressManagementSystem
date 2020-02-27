package com.capgemini.go.dto;

public class AddressDTO {

	private String addressId;
	private String retailerId;
	private String buildingNo;
	private String city;
	private String state;
	private String field;
	private String zip;
	private static int addressIdCounter = 1;

	public AddressDTO() {
		this.addressId = String.valueOf(addressIdCounter++);
	}

	public AddressDTO(String buildingNo, String city, String state, String field, String zip) {
		this.buildingNo = buildingNo;
		this.city = city;
		this.state = state;
		this.field = field;
		this.zip = zip;
		this.addressId = String.valueOf(addressIdCounter++);
	}

	@Override
	public String toString() {

		return " " + " AddressId : " + addressId + " Buildingno : " + buildingNo + " City : " + city + " State : "
				+ state + " Field : " + field + " Zip : " + zip;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(String retailerId) {
		this.retailerId = retailerId;
	}

	public String getBuildingNo() {
		return buildingNo;
	}

	public void setBuildingNo(String buildingNo) {
		this.buildingNo = buildingNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public static void main(String[] args) {

	}

}
