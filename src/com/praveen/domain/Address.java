package com.praveen.domain;

public class Address {
	
	private String country;
	private String city;
	private String street;
	private String zipcode;
	
	
	
	public Address() {
		super();
	}



	public Address(String country, String city, String street, String zipcode) {
		super();
		this.country = country;
		this.city = city;
		this.street = street;
		this.zipcode = zipcode;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public String getZipcode() {
		return zipcode;
	}



	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	
	

}
