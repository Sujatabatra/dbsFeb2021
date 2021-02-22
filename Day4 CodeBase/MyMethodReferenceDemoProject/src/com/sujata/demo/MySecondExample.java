package com.sujata.demo;

import java.util.function.Consumer;
//2. to call instance method from arbitrary object
class MyGreet{
	
	public void wish(String name){
		System.out.println("Hello "+name+" how r u?");
	}
}
public class MySecondExample {

	public static void main(String[] args) {
		
		/*
		 * System : class
		 * out : object of PrintWriter class and out is pointing to console
		 * println() : instance method of PrintWriter class
		 */
		System.out.println("Hello Everyone");
		
//		Consumer<String> cOb=(arg)->System.out.println(arg);
		Consumer<String> cOb=System.out::println;
		
		cOb.accept("Anju");
		
		
		MyGreet g=new MyGreet();
		
//		Consumer<String> cOb1=(arg)->g.wish(arg);
			
		Consumer<String> cOb1=g::wish;
		cOb1.accept("Radha");

	}

}
