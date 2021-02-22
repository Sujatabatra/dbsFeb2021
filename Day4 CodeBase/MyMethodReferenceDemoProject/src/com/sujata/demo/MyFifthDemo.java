package com.sujata.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MyFifthDemo {

	public static void main(String[] args) {
		//As we are calling instance method and that object is a part of argument list so class of first object
//		Function<List<String>, Integer> fOb=(list)->list.size();
		Function<List<String>, Integer> fOb=List::size;
		
		List<String> myList=Arrays.asList("First","second","third");
		
		System.out.println(fOb.apply(myList));
		

	}

}
