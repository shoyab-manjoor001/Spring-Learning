package com.jpa.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.demo.modal.Employee;

public interface EmpRepository extends CrudRepository<Employee, Integer>{

}
