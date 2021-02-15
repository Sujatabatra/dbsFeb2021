package com.sujata.demo;

//All classes without "extends" keyword are child classes of Object class
public class Student {

	private int rollNo;
	private String name;

	public Student() {

	}

	public Student(int rollNo, String name) {
		// Calling Object class Constructor
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayStudent() {
		System.out.println("Roll No : " + getRollNo());
		System.out.println("Name : " + name);
	}
}
