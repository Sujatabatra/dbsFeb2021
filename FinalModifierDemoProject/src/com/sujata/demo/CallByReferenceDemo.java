package com.sujata.demo;


class Dummy{
	int x;
	
	public void swap(Dummy d1,Dummy d2){
		d2.x=d1.x;
		d1.x=this.x;
		
		System.out.println("d1 : "+d1);
		System.out.println("d2 : "+d2);
		System.out.println("d3 : "+this);
		
	}
}
public class CallByReferenceDemo {

	public static void main(String[] args) {
		Dummy d1=new Dummy();
		d1.x=5;
		Dummy d2=new Dummy();
		d2.x=10;
		Dummy d3=new Dummy();
		d3.x=20;
		
		System.out.println("d1.x : "+d1.x);
		System.out.println("d2.x : "+d2.x);
		System.out.println("d3.x : "+d3.x);
		System.out.println("-------------");
		d3.swap(d1, d2);
		
		System.out.println("================");
		
		System.out.println("d1.x : "+d1.x);
		System.out.println("d2.x : "+d2.x);
		System.out.println("d3.x : "+d3.x);

	}

}
