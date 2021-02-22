package com.sujata.demo;

import java.util.function.UnaryOperator;
/*
 * @FunctionalInterface
 * interface UnaryOperator<T>{
 *   T apply(T arg);
 *  }
 */
public class UnaryOperatorDemo {

	public static void main(String[] args) {
		UnaryOperator<String> sOb=arg->arg.toUpperCase();
		
		System.out.println(sOb.apply("sujata"));
		

	}

}
