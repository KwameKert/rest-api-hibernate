package com.codeinsyt.springboot.cruddemo.dao;

import java.util.List;

import com.codeinsyt.springboot.cruddemo.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> findAll();
	

}
