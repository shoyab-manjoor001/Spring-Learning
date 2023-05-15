package com.springcore.ci;

public class AmbiguityEx {
	
	private int a , b;

	public AmbiguityEx(double a , double b)
	{
		super();
		this.a=(int) a;
		this.b=(int) b;
		System.out.println("Inside double method!!");
	}
	
	public AmbiguityEx(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Inside int method!!");
	}
	
	public AmbiguityEx(String a, String b)
	{
		super();
		this.a=Integer.parseInt(a) ;
		this.b=Integer.parseInt(b);
		System.out.println("Inside the String method!!");
	}
	
	public void doSum()
	{
		System.out.println("Value of a:"+a+"\nValue of b:"+b);
		System.out.println("Sum of the numbers: "+(this.a+this.b));
	}

}
