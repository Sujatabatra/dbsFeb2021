package com.sujata.demo;

public class Grade extends Marks {

	private double percentage;
	private String grade;


	public Grade() {
		super();
	}

	public Grade(int rollNo, String name, int marks1, int marks2, int marks3) {
		super(rollNo, name, marks1, marks2, marks3);
	}

	private String getGrade() {
		percentage = (getMarks1() + getMarks2() + getMarks3()) / 3;
		if (percentage > 75)
			grade = "A Grade";
		else
			grade = "B Grade";
		return grade;
	}

	public void displayStudent() {
		super.displayStudent();
		System.out.println("Garde : " + getGrade());
	}
}
