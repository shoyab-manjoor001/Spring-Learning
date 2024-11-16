package com.example.validation.entities;

public class Entity {

	private String ename;
	private String eemail;

	public Entity() {
		super();
	}

	public Entity(String entityName, String entityEmail) {
		super();
		this.ename = entityName;
		this.eemail = entityEmail;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEemail() {
		return eemail;
	}

	public void setEemail(String eemail) {
		this.eemail = eemail;
	}

	@Override
	public String toString() {
		return "Entity [ename=" + ename + ", eemail=" + eemail + "]";
	}

}
