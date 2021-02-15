package com.sujata.demo;

public class Square {

	private int side,area;

		public void setSide(int side) {
		this.side = side;
	}

	public int getArea() {
		Shapes sq=new Shapes();
		area=sq.area(side);
		return area;
	}

	
}
