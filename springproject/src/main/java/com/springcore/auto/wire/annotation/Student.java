package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private String name;
	private Address address;	

	@Autowired
	public Student(String name, Address address) {
		super();
		System.out.println("Inside Constructor student");
		this.name = name;
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setting Address....");
		this.address = address;
	}

//	public Student(Address address) {
//		super();
//		System.out.println("Indide constructor address");
//		this.address = address;
//	}

//	@Override
//	public String toString() {
//		return "Student [address=" + address + "]";
//	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting name");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}	
}
