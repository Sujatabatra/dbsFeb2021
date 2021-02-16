package com.sujata.training;

import com.sujata.demo.ButterPopCorn;
import com.sujata.demo.CaramelPopCorn;
import com.sujata.demo.PopCorn;

public class MyMain {

	public static void main(String[] args) {
//		PopCorn p1=new PopCorn();
//		p1.pop();
//		
//		ButterPopCorn p2=new ButterPopCorn();
//		p2.pop();
//		
//		CaramelPopCorn p3=new CaramelPopCorn();
//		p3.pop();
//		
		/*Dynamic Method Dispatch : Base Class Reference Variable is type compatible with Derived Class where as the reverse is not true.
		 * RunTime Function Call
		 * Object Slicing : If reference Variable is of Base class then reference variable will allow only to call data and method coming from base only or over ridden method,
		 * we won't be able to call new functionality with Base class reference variable.
		*/
		
		//Base Class Reference Variable
		PopCorn popCorn;
		
		popCorn=new ButterPopCorn();
		popCorn.pop();
		//Due to object slicing can't call quantity
//		popCorn.quantity();
		
		//still if we need to call quantity , type cast the reference variable to ButterPopCorn
		((ButterPopCorn)popCorn).butterQuantity(4);
		
		
		
//		popCorn=new CaramelPopCorn();
//		popCorn.pop();
//		
//				
//		popCorn=new PopCorn();
//		popCorn.pop();
		
		
		
	}

}
