package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/Cionfig.xml");
		Person person1 =(Person) context.getBean("person1");
		Address address = (Address) context.getBean("address1");
		System.out.println(person1);
		System.out.println(address);
		
	}

}
