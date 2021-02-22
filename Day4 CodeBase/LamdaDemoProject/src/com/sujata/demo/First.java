package com.sujata.demo;

/*
 * need and interface having just one method : Functional interfaces in java 8
 * if any interface is not function interface then that can't be the type for function type value variable
 * if we want to force interface to be functional , den we can make use of as annotation '@FunctionalInterface'
 
 */

@FunctionalInterface
interface Demo {
	// without return type and without argument
	void print();
}

@FunctionalInterface
interface Greet {
	// without return type and one argument
	void wish(String name);
}

@FunctionalInterface
interface Addition {
	// with return type and two arguments
	int sum(int num1, int num2);
}

public class First {

	public static void main(String[] args) {
		int x = 10;

		// datatype variable=function();
		// JDK1.8 : Functional Programming (Lambda)

		// Encapsulated Entity
		Demo a = new Demo() {
			public void print() {
				System.out.println("Hello!");
			}
		};
		/*
		 * Data type variable=value Data Type : Functional Interface variable:
		 * name of variable value : lambda expression which is the defination of
		 * method
		 */
		// Lambdas
		Demo var = () -> {
			System.out.println("Hello!");
		};

		var.print();

		// Greet gVar=(String name)-> {
		// System.out.println(name +" welcome to the world of Lambdas");
		// };

		// Greet gVar=(name)-> {
		// System.out.println(name +" welcome to the world of Lambdas");
		// };

//		Greet gVar = name -> {
//			System.out.println(name + " welcome to the world of Lambdas");
//		};

		Greet gVar = name -> System.out.println(name + " welcome to the world of Lambdas");

		gVar.wish("Varun");

//		Addition aVar = (int num1, int num2) -> {
//
//			return num1 + num2;
//		};

//		Addition aVar = (num1,num2) -> {
//
//			return num1 + num2;
//		};

		Addition aVar = (num1,num2) -> num1 + num2;
		
		
		int s = aVar.sum(10, 20);
		System.out.println("Sum of two numbers : " + s);

	}

}
