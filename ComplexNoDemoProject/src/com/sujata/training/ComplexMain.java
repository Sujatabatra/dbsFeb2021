package com.sujata.training;

public class ComplexMain {

	public static void main(String[] args) {
		
		Complex c1=new Complex();

		c1.inputComplexNo(2, -5);
		

		Complex c2=new Complex();
		c2.inputComplexNo(21, 15);
		
		System.out.print("First Complex No :");
		c1.display();
		System.out.print("Second Complex No :");
		c2.display();
		
		Complex c3=new Complex();
		c3.addComplex(c1, c2);
		System.out.print("Sum of  Complex Nos :");
		c3.display();
		
	}

}
