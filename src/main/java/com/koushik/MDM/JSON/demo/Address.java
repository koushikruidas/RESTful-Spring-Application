package com.koushik.MDM.JSON.demo;

public class Address {
	private String street;
	private String city;
	private String district;
	private String country;
	private String state;
	
	public Address() {
		
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getDistrict() {
		return district;
	}

	public String getCountry() {
		return country;
	}

	public String getState() {
		return state;
	}

	private void setStreet(String street) {
		this.street = street;
	}

	private void setCity(String city) {
		this.city = city;
	}

	private void setDistrict(String district) {
		this.district = district;
	}

	private void setCountry(String country) {
		this.country = country;
	}

	private void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", district=" + district + ", country=" + country
				+ ", state=" + state + "]";
	}
	
}
