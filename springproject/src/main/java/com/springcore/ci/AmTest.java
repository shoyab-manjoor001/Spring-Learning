package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AmTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Inside Ambigiuty Test");
		 ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/Cionfig.xml");
		  AmbiguityEx Am1 = (AmbiguityEx) context.getBean("am1");
		  Am1.doSum();
	}

}
