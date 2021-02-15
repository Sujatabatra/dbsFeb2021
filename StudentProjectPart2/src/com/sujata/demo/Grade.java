package com.sujata.demo;

//Ctrl+Shift+F : Auto Indettation of source file
//Ctrl+Space : Help/Suggestion/Auto Complete
public class Grade extends Marks {

	private double percentage;
	private String grade;

	// public Grade(){
	// //By Default first call goes to base class default constructor
	// /*
	// * Implicit call for base class constructor
	// * super();
	// */
	// //Explicit call to base class constructor can be made with super keyword
	// /*
	// * 1. super keyword must be the first statement in constructor call
	// */
	// super(0,null,0,0,0);
	// System.out.println("Hi I am Grade class constructor!");
	// }

	public Grade() {
		// Optional
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

	public void displayFullDetails() {
		displayStudentWithMarks();
		System.out.println("Garde : " + getGrade());
	}
}
