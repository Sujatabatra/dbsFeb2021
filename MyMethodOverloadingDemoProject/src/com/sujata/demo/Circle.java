package com.sujata.demo;

public class Circle {

	private double radius,area;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getArea() {
		Shapes ci=new Shapes();	
		area=ci.area(radius);
		return area;
	}
	
	
}
