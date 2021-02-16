package com.sujata.demo;

class Demo{
	
	static{
		System.out.println("Hi I am Demo class static Block X");
	}
	//instance block: which gets executed before every constructor call
	{
		System.out.println("Hi I am Demo class instance Block 1");
	}
	
	//static block : is the block which get executed just once at the class loading time
	static{
		System.out.println("Hi I am Demo class static Block 1");
	}
	
	Demo(){
		System.out.println("Hi I am Demo class default Constructor");
	}
	
	{
		System.out.println("Hi I am Demo class instance Block 2");
	}
	
	Demo(String name){
		System.out.println("Hi "+name+" I am Demo class argumented Constructor");
	}
	static{
		System.out.println("Hi I am Demo class static Block 2");
	}
}
public class StaticBlockDemo {

	public static void main(String[] args) {
		Demo d1=new Demo();
		System.out.println("==================");
		Demo d2=new Demo("AAAAA");
		System.out.println("==============");
		Demo d3=new Demo();
		System.out.println("==================");
		Demo d4=new Demo("BBBBB");
		

	}

}
