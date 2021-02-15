package com.sujata.training;

public class SecondClass {

	void show(){
		System.out.println("Hi I am show method of default scope from com.sujata.training.SecondClass");
	}
	
	public void display(){
		System.out.println("Hi I am display method of public scope from com.sujata.training.SecondClass");
	}
	
	private void demo(){
		System.out.println("Hi I am demo method of private scope from com.sujata.training.SecondClass");
	}
	
	public void callFirstClassMethods(){
		FirstClass fOb=new FirstClass();
		fOb.show();
	}
}
