package com.forexcard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {
	@Id
	private Integer id;
	
	private String flatNumber;
	
	private String buildingName;
	
	private String streetName;
	
	private String city;
	
	private String state;
	
	private Integer pincode;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String flatNumber, String buildingName, String streetName, String city, String state,
			Integer pincode) {
		super();
		this.flatNumber = flatNumber;
		this.buildingName = buildingName;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public String getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
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

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [flatNumber=" + flatNumber + ", buildingName=" + buildingName + ", streetName=" + streetName
				+ ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
}
