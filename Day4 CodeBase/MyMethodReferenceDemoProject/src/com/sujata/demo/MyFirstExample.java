package com.sujata.demo;

import java.util.function.Function;
import java.util.function.UnaryOperator;

//1. to call static method
class Greet{
	static String wish(String name){
		return "Welcome "+name+" to the world of method reference";
	}
}
public class MyFirstExample {

	public static void main(String[] args) {
//		Function<String, Integer> convertToInt=value->{
//			return Integer.parseInt(value);
//		};

//		Function<String, Integer> convertToInt=value->Integer.parseInt(value);
		
		//calling static methods with method references
		Function<String, Integer> convertToInt=Integer::parseInt;
		
		System.out.println(convertToInt.apply("10"));
		
//		UnaryOperator<String> uOb=na->Greet.wish(na);
		/*
		 * @FunctionalInterface
		 * interface UnaryOperator<T>{
		 * T apply(T);
		 * }
		 */
		UnaryOperator<String> uOb=Greet::wish;
		
		String output=uOb.apply("Pavan");
		System.out.println(output);
	}

}
