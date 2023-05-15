package com.springcore.springproject;

public class Student {
	
	private int studentId;
	private String studentName;
	private String studentCity;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int studentId, String studentName, String studentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}
	
	public int getStudentId() {
		System.out.println("getting ID");
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		System.out.println("Setting ID");
		this.studentId = studentId;
	}
	
	public String getStudentName() {
		System.out.println("getting name");
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		System.out.println("Setting name");
		this.studentName = studentName;
	}
	public String getStudentCity() {
		System.out.println("getting city");
		return studentCity;
	}
	
	public void setStudentCity(String studentCity) {
		System.out.println("Setting city");
		this.studentCity = studentCity;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ "]";
	}

}
