package com.jpa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.demo.dao.EmpRepository;
import com.jpa.demo.modal.Employee;


@SpringBootApplication
public class SpringBootJpaDemoApplication {

	public static void main(String[] args)
	{
	 ApplicationContext context = SpringApplication.run(SpringBootJpaDemoApplication.class, args);
	EmpRepository empRepository = context.getBean(EmpRepository.class);
	
	// creating first user...
//	Employee user = new Employee();
//	user.setCity("Delhi");
//	user.setName("Shoyab");
//	user.setStatus("Java Developer");
	
	// creating second user....
//	Employee user1 = new Employee();
//	user.setCity("Noida");
//	user.setName("Sameer");
//	user.setStatus("Python Developer");
//	Employee user2 = empRepository.save(user);
//	Employee user3 = empRepository.save(user1);
	
	
//	System.out.println(user2);
	
	System.out.println(empRepository.findAll());
	}

}
