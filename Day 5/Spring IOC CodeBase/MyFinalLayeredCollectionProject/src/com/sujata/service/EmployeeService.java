package com.sujata.service;

import java.util.ArrayList;

import com.sujata.pojo.Employee;

public interface EmployeeService {

	ArrayList<Employee> getAllEmployees();
	Employee searchEmployeeById(int id);
	Employee convertEmpUpperCase(Employee employee);
}
