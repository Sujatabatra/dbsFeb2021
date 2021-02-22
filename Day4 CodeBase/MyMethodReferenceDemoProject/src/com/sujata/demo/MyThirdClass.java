package com.sujata.demo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

//to call instance method from the object which is the part of argument list
public class MyThirdClass {

	public static void main(String[] args) {
//		UnaryOperator<String> uOb=(arg)->arg.toUpperCase();
		
		UnaryOperator<String> uOb=String::toUpperCase;
		
		String output= uOb.apply("ravi");
		System.out.println(output);
		
//		BiFunction<String, String, Integer> bOb=(arg1,arg2)->arg1.compareTo(arg2);
		
		BiFunction<String, String, Integer> bOb=String::compareTo;
		
		System.out.println(bOb.apply("Sujata", "Sujata"));
		

	}

}
