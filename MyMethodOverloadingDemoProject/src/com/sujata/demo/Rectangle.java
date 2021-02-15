package com.sujata.demo;

public class Rectangle {

	private int length, breadth, area;

	public int getArea() {
		Shapes rect = new Shapes();
		area= rect.area(length, breadth);
		return area;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

}
