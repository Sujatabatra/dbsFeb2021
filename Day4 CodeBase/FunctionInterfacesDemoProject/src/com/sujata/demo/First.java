package com.sujata.demo;

import java.util.function.BiFunction;
import java.util.function.Consumer;

/*
 * need and interface having just one method : Functional interfaces in java 8
 * if any interface is not function interface then that can't be the type for function type value variable
 * if we want to force interface to be functional , den we can make use of as annotation '@FunctionalInterface'
 
 */

@FunctionalInterface
interface Demo {
	
	void print();
}

@FunctionalInterface
interface Greet {
	
	void wish(String name);
}

@FunctionalInterface
interface Addition {
	
	int sum(int num1, int num2);
}

public class First {

	public static void main(String[] args) {
		int x = 10;
		Demo a = new Demo() {
			public void print() {
				System.out.println("Hello!");
			}
		};
		Demo var = () -> {
			System.out.println("Hello!");
		};

		var.print();

		Greet gVar = name -> System.out.println(name + " welcome to the world of Lambdas");

		gVar.wish("Varun");

		Consumer<String> cVar=name->System.out.println(name+" Welcome to the would of functional interfaces and lambdas");
		cVar.accept("Sujata");
		
		Addition aVar = (num1,num2) -> num1 + num2;
		
		BiFunction<Integer, Integer, Integer> bfVar=(num1,num2) -> num1 + num2;
		
		System.out.println(" SUM : "+bfVar.apply(30, 12));
		
		int s = aVar.sum(10, 20);
		System.out.println("Sum of two numbers : " + s);

	}

}
