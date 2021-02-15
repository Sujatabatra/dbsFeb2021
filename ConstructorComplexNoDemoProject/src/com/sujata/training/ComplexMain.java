package com.sujata.training;

public class ComplexMain {

	public static void main(String[] args) {
		Complex c1=new Complex(4,5);
		
		System.out.print("First Complex No :");
		c1.display();
	
		Complex c2=new Complex();
		c2.display();
		
//		Complex c3=new Complex(4);
		
		Complex cOb=c1.getComplexNumber();
		cOb.display();
	}

}
