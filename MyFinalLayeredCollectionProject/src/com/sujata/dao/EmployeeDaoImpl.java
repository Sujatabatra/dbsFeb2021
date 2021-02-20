package com.sujata.dao;

import java.util.ArrayList;
import java.util.Iterator;

import com.sujata.pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private static ArrayList<Employee> employeeList=new ArrayList<>();
	/*
	 * As we don;t have any database so we are hardcoding the records
	 * otherwise in practical scenario we read data from database
	 */
	static{
		employeeList.add(new Employee(111, "AAAA", "Associate", "IT", 67000));
		employeeList.add(new Employee(222, "BBBB", "Executive", "Sales", 27000));
		employeeList.add(new Employee(333, "CCCC", "Sr. Associate", "IT", 89000));
		employeeList.add(new Employee(444, "DDDD", "Associate", "HR", 70000));
		employeeList.add(new Employee(555, "EEEE", "Manager", "Sales", 87000));
	}
	
	@Override
	public ArrayList<Employee> getAllRecords() {
		return employeeList;
	}

	@Override
	public Employee searchRecordById(int id) {
		Iterator<Employee> eIt=employeeList.iterator();
		Employee employee=null;
		while(eIt.hasNext()){
			employee=eIt.next();
			if(employee.getId()==id)
				return employee;
		}
		return null;
	}

}
