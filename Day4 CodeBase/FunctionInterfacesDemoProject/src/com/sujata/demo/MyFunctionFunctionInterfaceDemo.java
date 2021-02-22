package com.sujata.demo;

import java.util.function.Function;

interface ConvertInt {
	Integer convertStringToInt(String args);
}

public class MyFunctionFunctionInterfaceDemo {

	public static void main(String[] args) {

		// ConvertInt cVar=new ConvertInt() {
		//
		// @Override
		// public Integer convertStringToInt(String args) {
		// return Integer.parseInt(args);
		// }
		// };

		ConvertInt cVar = arg-> {
				return Integer.parseInt(arg);
			};
		

		Function<String, Integer> fOb = arg -> Integer.parseInt(arg);

		Integer i=fOb.apply("10");
		System.out.println("i : "+i);
	}

}
