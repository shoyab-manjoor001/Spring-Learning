package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Collection CiTest!!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/CollectionConfig.xml");
		Employee emp = (Employee) context.getBean("employee1");
		System.out.println(emp);
		System.out.println(emp.getAddress().getClass().getName());
		System.out.println(emp.getPhones().getClass().getName());
	}

}
