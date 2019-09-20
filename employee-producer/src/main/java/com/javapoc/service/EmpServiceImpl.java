package com.javapoc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Service;

import com.javapoc.model.Employee;

@Service("EmpService")
public class EmpServiceImpl implements EmpService {
	
	private static List<Employee> emp;
	
	private static final AtomicLong counter = new AtomicLong();
	
	
	public Employee findById(long id) {
		for(Employee emps : emp){
			if(emps.getEmpId() == id){
				return emps;
			}
		}
		return null;
	}
	
	public List<Employee> findAllUsers() {
		return populateDummyUsers();
	}
	
	private  List<Employee> populateDummyUsers(){
		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(counter.incrementAndGet(),"Sam","TA", 70000));
		employee.add(new Employee(counter.incrementAndGet(),"Tom","TL", 50000));
		employee.add(new Employee(counter.incrementAndGet(),"Jerome","Arch", 30000));
		employee.add(new Employee(counter.incrementAndGet(),"Silvia","PA", 40000));
		
		return employee;
	}
	

}
