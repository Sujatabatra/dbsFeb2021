package com.sujata.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sujata.presentation.EmployeePresentation;
import com.sujata.presentation.EmployeePresentationImpl;

public class EmployeeClient {

	public static void main(String[] args) {
//		EmployeePresentation presentation=new EmployeePresentationImpl();
		ApplicationContext springContainer=new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
		
		EmployeePresentation presentation=(EmployeePresentation)springContainer.getBean("presentation");
		
		Scanner sc=new Scanner(System.in);
		while(true){
			presentation.showMenu();
			System.out.println("Enter Choice");
			int choice=sc.nextInt();
			presentation.performMenu(choice);
			
		}

	}

}
