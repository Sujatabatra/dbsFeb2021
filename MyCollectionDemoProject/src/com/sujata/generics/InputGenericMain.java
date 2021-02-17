package com.sujata.generics;

public class InputGenericMain {

	public static void main(String[] args) {
		
		InputGeneric<Double> dOb=new InputGeneric<Double>();
		dOb.setValue(34.7);
		
		InputGeneric<Character> cOb=new InputGeneric<>();
		cOb.setValue('s');
		
		System.out.println("dOb : "+dOb);
		System.out.println("cOb : "+cOb);

		InputGeneric<Employee> eOb=new InputGeneric<Employee>();
		eOb.setValue(new Employee(123, "Neha", "Executive", "HR", 45000));
		System.out.println("eOb : "+eOb);
		
		
		InputGenericTwo<String, Integer> data=new InputGenericTwo<String,Integer>("AAA",12);
		System.out.println("data : "+data);
		
	}

}
