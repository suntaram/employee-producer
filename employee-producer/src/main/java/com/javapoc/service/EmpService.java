package com.javapoc.service;

import java.util.List;

import com.javapoc.model.Employee;

public interface EmpService {
	
	Employee findById(long id);
	
	/*Employee findByName(String name);
	
	void saveEmployee(Employee emp);*/
	
	List<Employee> findAllUsers();
	

	
	
	

}
