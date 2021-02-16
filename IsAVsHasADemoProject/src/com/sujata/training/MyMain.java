package com.sujata.training;

import com.sujata.demo.Address;
import com.sujata.demo.Employee;

public class MyMain {

	public static void main(String args[]){
		Employee employee=new Employee("P001", "Radha", new Address(111, "", "Gurugram", "Haryana", "23415"), "IT", "Associate", "12345");
		System.out.println("Employee ID : "+employee.getpId());
		System.out.println("Employee Name : "+employee.getpName());
		System.out.println("Address : "+employee.getpAddress().gethNo()+" "+employee.getpAddress().getStreetName()+","+employee.getpAddress().getCity()+","+employee.getpAddress().getState()+","+employee.getpAddress().getPincode());
		System.out.println("Department : "+employee.getDepartment());
		System.out.println("Designation : "+employee.getDesignation());
		System.out.println("Salary : "+employee.getSalary());
		
	}
}
