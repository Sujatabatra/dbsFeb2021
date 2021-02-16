package com.sujata.demo;


final class GrandParent{
	public void display(){
		System.out.println("Hi I am display method from GrandParent");
	}
}

//As GrabdParent class is final so we won't be able to extends GrandParent class
class Parent/* extends GrandParent*/{
	
	private int x;
	//while declaring a variable as final we need to intilize it as well
	final private int y=10;
	
	public void changeValues(){
		x=x+5;
		//As 'y' is final we won't be able to change its value
//		y=y+5;
	}
	
	public final void showValues(){
		System.out.println(" x : "+x);
		System.out.println(" y : "+y);
	}
	
	public void show(){
		System.out.println("Hi I am show method from Parent");
	}
}

class Child extends Parent{
	
//	As showValues() is final we won't be able to over ride it
//	public void showValues(){
//		System.out.println("From Child ");
//		super.showValues();
//	}
	//Overridden
	public void show(){
		System.out.println("Hi I am show method from Child");
	}
}
public class MyFinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
