package com.javapoc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javapoc.model.Employee;
import com.javapoc.service.EmpService;

@RestController
public class TestController {
	
	@Autowired
	EmpService empService;

	@RequestMapping(value = "/employee/", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> listAllEmp() {
		List<Employee> emp = empService.findAllUsers();
		if(emp.isEmpty()){
			return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<Employee>>(emp, HttpStatus.OK);
	}

}
