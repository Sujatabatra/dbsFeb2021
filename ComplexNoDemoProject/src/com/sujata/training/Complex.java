package com.sujata.training;

public class Complex {

	private int real,imag;
	
	public void inputComplexNo(int r,int i){
		real=r;
		imag=i;
	}
	
	public void display(){
		System.out.print(real);
		if(imag>0)
			System.out.println("+"+imag+"i");
		else
			System.out.println(imag+"i");
	}
	
	public void addComplex(Complex c1,Complex c2){
		real=c1.real+c2.real;
		imag=c1.imag+c2.imag;
	}
}
