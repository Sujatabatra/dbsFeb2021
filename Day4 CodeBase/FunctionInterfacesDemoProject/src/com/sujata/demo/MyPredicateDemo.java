package com.sujata.demo;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class MyPredicateDemo {

	public static void main(String[] args) {
//		Predicate<Integer> pOb=age->age>=18;
		IntPredicate pOb=age->age>=18;
		
		if(pOb.test(18))
			System.out.println("Can vote");
		else
			System.out.println("Can't Vote");

	}

}
