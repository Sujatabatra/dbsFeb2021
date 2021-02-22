package com.sujata.service;

import java.util.ArrayList;
import java.util.Optional;

import com.sujata.dao.EmployeeDao;
import com.sujata.dao.EmployeeDaoImpl;
import com.sujata.pojo.Employee;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao empDao = new EmployeeDaoImpl();

	@Override
	public ArrayList<Employee> getAllEmployees() {

		return empDao.getAllRecords();
	}

	@Override
	public Employee searchEmployeeById(int id) {
//		Employee emp=empDao.searchRecordById(id);
//		if(emp!=null)
//			return convertEmpUpperCase(emp);
		
		Optional<Employee> oEmp=empDao.searchRecordByIdUsingOptional(id);
		
//		oEmp.ifPresent(emp->System.out.println(emp));
		
		if(oEmp.isPresent())
			return oEmp.get();
		return null;
	}
	//Bussiness Logic
	public Employee convertEmpUpperCase(Employee employee){
		Employee emp=new Employee(employee.getId(),employee.getName().toUpperCase(),employee.getDesignation().toUpperCase(),employee.getDepartment().toUpperCase(),employee.getSalary());
		return emp;
	}

}
