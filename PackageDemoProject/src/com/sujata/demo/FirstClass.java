package com.sujata.demo;

/* 1.In a source file we can have just zero or one public class and multiple default classes , 
 * source file name should match with the public class name if any public class exist otherwise no restriction on name
 * 2. whatever classes we will be writing in a source file will be getting created under the same package structure mentioned in package statement on top.
 * 3. main method must always be in public class
 * 
*/

public class FirstClass {
	void show() {
		System.out.println("Hi I am show method of default scope from com.sujata.demo.FirstClass");
	}

	public void display() {
		System.out.println("Hi I am display method of public scope from com.sujata.demo.FirstClass");
	}

	private void demo() {
		System.out.println("Hi I am demo method of private scope from com.sujata.demo.FirstClass");
	}
}

class DemoClass{
	public void demoMethod(){
		System.out.println("Hi I am demoMethod method of default scope from com.sujata.demo.DemoClass");
	}
}
