package com.sujata.dao;

import java.util.ArrayList;
import java.util.Optional;

import com.sujata.pojo.Employee;

public interface EmployeeDao {

	ArrayList<Employee> getAllRecords();
	Employee searchRecordById(int id);
	public Optional<Employee> searchRecordByIdUsingOptional(int id);
	
}
