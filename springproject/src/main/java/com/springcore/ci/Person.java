package com.springcore.ci;

public class Person {

	private String name;
	private String contact;
	private Address address;
	
	public Person(String name, String contact, Address address) {
		super();
		this.name = name;
		this.contact = contact;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Name: "+this.contact+"\tContact: "+this.contact+"\tAddress: "+this.getAddress();
	}
}
