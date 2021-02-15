package com.sujata.demo;

//Method Overloading : methods are differentiated from each other w.r.t. method signature
public class Shapes {

	public int area(int l,int b){
		return l*b;
	}
	
	public double area(double radius){
		return 3.14*radius*radius;
	}
	
	public int area(int side){
		return side*side;
	}
}
