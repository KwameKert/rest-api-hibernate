package com.codeinsyt.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeinsyt.springboot.cruddemo.dao.EmployeeDAO;
import com.codeinsyt.springboot.cruddemo.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	private EmployeeDAO employeeDOA;
	
	@Autowired
	public EmployeeRestController(EmployeeDAO employeeDAO) {
		this.employeeDOA = employeeDAO;
	}
	
	
	@GetMapping("/employees")
	public List<Employee> findAll(){
		return this.employeeDOA.findAll();
	}
	
	
	@GetMapping("/test")
	public String test() {
		return  "Hello world";
	}
	
}
