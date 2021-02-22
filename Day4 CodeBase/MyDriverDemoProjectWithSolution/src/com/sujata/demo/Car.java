package com.sujata.demo;


/*
 * 1. We cannot instantiate(Create Object) of abtract class.
 * 2. abstract methods are like a contract to the child classes, which child classes are supposed to fulfil otherwise child classes will also be abstract
 * 3. If we have even a single method as abstract, its mandatory to mark that class also as abtract.
 * 
 */
abstract public class Car {

	private String model,color;

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}
	
	//Contract with child , that child needs to implement in any child failed to do so then child will be forced to become abstract too
	abstract public void engine();
}
