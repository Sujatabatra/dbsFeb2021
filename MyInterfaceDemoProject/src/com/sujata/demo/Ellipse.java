package com.sujata.demo;

public class Ellipse extends ShowResult implements Shape, RoundedShape {

	private double xAxis,yAxis;
	
	
	public Ellipse(double xAxis, double yAxis) {
		super();
		this.xAxis = xAxis;
		this.yAxis = yAxis;
	}

	@Override
	public void circumference() {
		setCir(xAxis+yAxis);
		System.out.println("Circumference of ellipse : "+getCir());

	}

	@Override
	public void area() {
		setAr(3.14*xAxis*yAxis);
		System.out.println("Area of ellipse : "+getAr());
		

	}

}
