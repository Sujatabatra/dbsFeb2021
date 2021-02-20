package com.sujata.service;

import java.util.ArrayList;

import com.sujata.dao.EmployeeDao;
import com.sujata.dao.EmployeeDaoImpl;
import com.sujata.pojo.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao empDao = new EmployeeDaoImpl();

	@Override
	public ArrayList<Employee> getAllEmployees() {

		return empDao.getAllRecords();
	}

	@Override
	public Employee searchEmployeeById(int id) {
		Employee emp=empDao.searchRecordById(id);
		if(emp!=null)
			return convertEmpUpperCase(emp);

		return emp;
	}
	//Bussiness Logic
	public Employee convertEmpUpperCase(Employee employee){
		Employee emp=new Employee(employee.getId(),employee.getName().toUpperCase(),employee.getDesignation().toUpperCase(),employee.getDepartment().toUpperCase(),employee.getSalary());
		return emp;
	}

}
