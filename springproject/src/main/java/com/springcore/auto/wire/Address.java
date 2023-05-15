package com.springcore.auto.wire;

public class Address {
	
	private String locality;
	private String city;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(String locality, String city) {
		super();
		System.out.println("Inside constuctor Address Class");
		this.locality = locality;
		this.city = city;
	}

	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		System.out.println("Setting Locality...");
		this.locality = locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		System.out.println("Setting city..");
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [locality=" + locality + ", city=" + city + "]";
	}
	
}
