package com.sujata.training;

import com.sujata.demo.Circle;
import com.sujata.demo.Rectangle;
import com.sujata.demo.Square;

public class ShapesMain {

	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle();
		rectangle.setLength(5);
		rectangle.setBreadth(8);
		int areaRec=rectangle.getArea();
		System.out.println("Area of Rectangle : "+areaRec);
		
		Circle cOb=new Circle(4.5);
		double areaCir=cOb.getArea();
		System.out.println("Area of Circle "+areaCir);
		
				

	}

}
