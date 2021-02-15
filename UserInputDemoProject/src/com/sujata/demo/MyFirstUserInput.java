package com.sujata.demo;

import java.util.Scanner;

/*default import is of java.lang , 
if we are making use of any of the class which is not part of java .jang package we need to import that class package*/
public class MyFirstUserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name=scanner.next();
		System.out.println("Enter your age : ");
		int age=scanner.nextInt();
		System.out.println("Entered Name : "+name);
		System.out.println("Entered Age : "+age);
		
	}

}
