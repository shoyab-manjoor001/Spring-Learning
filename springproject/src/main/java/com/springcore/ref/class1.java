package com.springcore.ref;

public class class1 {
	
	private int a;
	private class2 cl2;
	public class1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public class1(int a, class2 cl2) {
		super();
		this.a = a;
		this.cl2 = cl2;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public class2 getCl2() {
		return cl2;
	}
	public void setCl2(class2 cl2) {
		this.cl2 = cl2;
	}
	@Override
	public String toString() {
		return "class1 [a=" + a + ", cl2=" + cl2 + "]";
	}
}
