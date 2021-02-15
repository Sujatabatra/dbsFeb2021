package com.sujata.demo;

public class Grade extends Marks {

	private double percentage;
	private String grade;
	
	private String getGrade(){
		percentage=(getMarks1()+getMarks2()+getMarks3())/3;
		if(percentage>75)
			grade="A Grade";
		else
			grade="B Grade";
		return grade;
	}
	
	public void displayFullDetails(){
		displayStudentWithMarks();
		System.out.println("Garde : "+getGrade());
	}
}
