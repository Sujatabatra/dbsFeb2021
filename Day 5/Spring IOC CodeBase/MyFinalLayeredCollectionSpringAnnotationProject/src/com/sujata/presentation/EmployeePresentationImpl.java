package com.sujata.presentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.pojo.Employee;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

@Component("presentation")
public class EmployeePresentationImpl implements EmployeePresentation{

//	private EmployeeService empService=new EmployeeServiceImpl();
	
	@Autowired
	private EmployeeService empService;
	
	@Override
	public void showMenu() {
		System.out.println("1. Show All Records");
		System.out.println("2. Search Employee By ID");
		System.out.println("3. Exit");
		
	}

	@Override
	public void performMenu(int choice) {
		Scanner sc=new Scanner(System.in);
		switch(choice){
		case 1:
			ArrayList<Employee> emps=empService.getAllEmployees();
			Iterator<Employee> it=emps.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
			break;
		case 2:
			System.out.println("Enter Employee Id whose record you want to search");
			int id=sc.nextInt();
			Employee emp=empService.searchEmployeeById(id);
			if(emp==null)
				System.out.println("No employee found with id "+id);
			else
				System.out.println(emp);
			break;
		case 3:
			System.out.println("Thanks for using the system, Have a nice day!");
			System.exit(0);
		default:
			System.out.println("");
			
		}
		
	}

}
