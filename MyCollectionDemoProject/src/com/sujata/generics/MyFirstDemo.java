package com.sujata.generics;


class InputInteger{
	private Integer value;

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "MyClass [value=" + value + "]";
	}
	
	
}

class InputFloat{
	private Float value;

	public Float getValue() {
		return value;
	}

	public void setValue(Float value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "InputFloat [value=" + value + "]";
	}
	
	
}

class InputEmployee{
	private Employee value;

	public Employee getValue() {
		return value;
	}

	public void setValue(Employee value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "InputEmployee [value=" + value + "]";
	}
	
	
}
public class MyFirstDemo {

	public static void main(String[] args) {
		InputInteger ob=new InputInteger();
		ob.setValue(10);
		System.out.println("ob : "+ob);

		InputFloat ob1=new InputFloat();
		ob1.setValue(23.4f);
		System.out.println("ob1 : "+ob1);
		
		InputEmployee ob2=new InputEmployee();
		ob2.setValue(new Employee(111, "Amit", "Associate", "Sales", 12345));
		System.out.println(" ob2 : "+ob2);
	}

}
