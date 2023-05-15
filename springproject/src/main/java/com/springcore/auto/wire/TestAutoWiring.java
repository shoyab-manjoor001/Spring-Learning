package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWiring {
	public static void main(String[] args) {
		
		 ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoConfig.xml");
		 Student s1 = context.getBean("s1",Student.class);
		 System.out.println(s1);
	}
}
