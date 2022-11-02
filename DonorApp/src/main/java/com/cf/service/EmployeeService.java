package com.cf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cf.dao.EmployeeRepository;
import com.cf.model.Employee;

@Service
public class EmployeeService 
{
	
	@Autowired
	private EmployeeRepository eRepo;
	
	public  List<Employee> findAll()
	{
		List<Employee>  employee=eRepo.findAll();

		return employee;
	}
}
