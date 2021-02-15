package com.sujata.demo;

public class Marks extends Student {

	private int marks1, marks2, marks3;

	public Marks() {
		super();
	}
	// public Marks(int r, String n,int m1,int m2,int m3){
	// //By Default first call goes to base class default constructor
	// setRollNo(r);
	// setName(n);
	// marks1=m1;
	// marks2=m2;
	// marks3=m3;
	//// System.out.println("Hi I am Marks class Constructor!");
	// }

	public Marks(int rollNo, String name, int marks1, int marks2, int marks3) {
		super(rollNo, name);
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	public int getMarks1() {
		return marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public int getMarks3() {
		return marks3;
	}

	public void inputStudentDetailsWithMarks(int r, String n, int m1, int m2, int m3) {
		setRollNo(r);
		setName(n);
		marks1 = m1;
		marks2 = m2;
		marks3 = m3;
	}

	public void displayStudentWithMarks() {
		displayStudent();
		System.out.println("Marks 1 : " + marks1);
		System.out.println("Marks 2 : " + marks2);
		System.out.println("Marks 3 : " + marks3);
	}

}
