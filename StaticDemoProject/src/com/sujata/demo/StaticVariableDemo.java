package com.sujata.demo;

class DummyStatic{
	//instance variable
	int x;
	//class variable : stack at compile time
	static int y;
	public void showXY(){
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
	static{
		System.out.println("Hello from Static block");
	}
}
public class StaticVariableDemo {

	public static void main(String[] args) {

		DummyStatic.y=10;
		System.out.println("y: "+DummyStatic.y);
		
//		DummyStatic.x=20;
		
		DummyStatic dOb1=new DummyStatic();
		
		DummyStatic dOb2=new DummyStatic();
		
		dOb1.y=dOb1.y+5;
		System.out.println("dOb2.y : "+dOb2.y);
		
		System.out.println("DummyStatic.y : "+DummyStatic.y);
		
		
		DummyStatic dOb3;
		
		
		

	}

}
