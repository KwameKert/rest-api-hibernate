package com.codeinsyt.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeinsyt.springboot.cruddemo.dao.EmployeeDAO;
import com.codeinsyt.springboot.cruddemo.entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {

	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeServiceImp(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	
	@Override
	public List<Employee> listEmployees() {
		return this.employeeDAO.findAll();
		
	}

	@Override
	public Employee getEmployee(int id) {
		return this.employeeDAO.findById(id);
		
	}

	@Override
	public void createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(int id) {
		this.employeeDAO.deleteById(id);
		// TODO Auto-generated method stub
		
	}

}
