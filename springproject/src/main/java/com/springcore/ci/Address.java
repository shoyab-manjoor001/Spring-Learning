package com.springcore.ci;

public class Address {

	private int streetNo;
	private String locality;
	private String city;
	
	public Address(int streetNo, String locality, String city) {
		super();
		this.streetNo = streetNo;
		this.locality = locality;
		this.city = city;
	}
	public int getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [streetNo=" + streetNo + ", locality=" + locality + ", city=" + city + "]";
	}	
}
