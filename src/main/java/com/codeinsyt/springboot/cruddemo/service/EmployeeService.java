package com.codeinsyt.springboot.cruddemo.service;

import java.util.List;

import com.codeinsyt.springboot.cruddemo.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> listEmployees();
	
	public Employee getEmployee(int id);
	
	public void createEmployee(Employee employee);
	
	public void deleteEmployee(int id);
	
	

}
