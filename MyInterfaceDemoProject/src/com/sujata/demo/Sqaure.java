package com.sujata.demo;

public class Sqaure implements NonRoundedShape {

	private int side;
	
	public Sqaure(int side) {
		super();
		this.side = side;
	}
	
	@Override
	public void area() {
		int area=side*side;
		System.out.println("Area of Sqaure : "+area);
	}

	@Override
	public void perimeter() {
		int perimeter=4*side;
		System.out.println("Perimeter of Sqaure : "+perimeter);

	}

}
