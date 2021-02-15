package com.sujata.client;

import com.sujata.demo.Grade;
import com.sujata.demo.Marks;
import com.sujata.demo.Student;

public class MyMain {

	public static void main(String[] args) {
		Student student=new Student();
		student.setRollNo(101);
		student.setName("AAAA");
		
		student.displayStudent();
		
		System.out.println("=================");
		
		Marks student2=new Marks();
		student2.inputStudentDetailsWithMarks(102, "Astha", 89, 99, 67);
		student2.displayStudentWithMarks();

		System.out.println("=====================");
		
		Grade grade=new Grade();
		grade.inputStudentDetailsWithMarks(111, "Bharti", 67, 89, 56);
		grade.displayFullDetails();
	}

}
