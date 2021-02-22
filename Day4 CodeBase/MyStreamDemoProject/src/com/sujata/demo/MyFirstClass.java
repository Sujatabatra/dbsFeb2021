package com.sujata.demo;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.*;

import java.util.ArrayList;

public class MyFirstClass {

	public static void main(String[] args) {

		List<String> myList = Arrays.asList("Sujata", "Niharika", "Pavan", "Radha", "Ravi", "Sharath", "Sridhar","Ravi", "Sharath", "Sridhar",
				"Varun");

		myList.stream()
		.forEach(arg -> System.out.println(arg)); //terminal method

		System.out.println("==================");

		myList.stream()
		.limit(3) //intermediate
		.forEach(System.out::println);
		System.out.println("============");

		myList.stream()
		.distinct() //intermediate
		.map(arg -> arg.toUpperCase())
		.forEach(System.out::println);  //Final Method
		System.out.println("================");
		// for(String str:myList){
		// System.out.println(str.toUpperCase());
		// }

		List<String> newList1 = myList.stream().map(String::toUpperCase).collect(toList());

		System.out.println(newList1);
		System.out.println("=================");

		//pipeing methods
		List<String> newList2 = myList.stream()
				.filter(arg -> arg.length() > 5) // filteringdata (intermediate methods)
				.map(String::toUpperCase) // converting data (intermediate method)
				.collect(toList()); // collecting data (Terminal Method)

//		String st = null;
//		ArrayList<String> newList3 = new ArrayList<>();
//		for (String str : myList) {
//			if (str.length() > 5) {
//				st = str.toUpperCase();
//				newList3.add(st);
//			}
//		}
		System.out.println(newList2);
	}

}
