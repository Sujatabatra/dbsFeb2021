package com.sujata.demo;

//One class can implement multiple contracts
public class Circle implements Shape, RoundedShape {

	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void circumference() {
		double cir=2*PI*radius;
		System.out.println("Circumference of Circle : "+cir);

	}

	@Override
	public void area() {
		double ar=PI*radius*radius;
		System.out.println("Area of Circle : "+ar);

	}

}
