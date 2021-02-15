package com.sujata.demo;

public class Marks extends Student {

	private int marks1, marks2, marks3;

	public int getMarks1() {
		return marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public int getMarks3() {
		return marks3;
	}

	public void inputStudentDetailsWithMarks(int r, String n,int m1,int m2,int m3){
		setRollNo(r);
		setName(n);
		marks1=m1;
		marks2=m2;
		marks3=m3;
	}
	public void displayStudentWithMarks() {
		displayStudent();
		System.out.println("Marks 1 : " + marks1);
		System.out.println("Marks 2 : " + marks2);
		System.out.println("Marks 3 : " + marks3);
	}

}
