package com.sujata.training;

/*
 * Constructor : are the very first function which gets called while creating an Object
 * 2. Constructors are used to initialise objects while creating them
 * 3. Constructor name must be same as that of your class name
 * 4. Constructors can be argumented as well as non argumented
 * 5. Constructor cannot return any value not even void
 * 6. Constructor can be of any scope i.e private, default and public 
 * 
 * If we are not creating the constructor(If our class is constructor challenged) 
 * then only compiler will create one no argument constructor(default constructor)
 *  for us and initialise all object variables with default initial values , int :0, long :0L, float =0.0f, double=0.0, boolean=false
 */
public class Complex {

	private int real,imag;
	
	//Constructor Overloading (Polymorphism)
	//We can create multiple constructor but all constructors will be differentiated from each other w.r.t. its signature
	//signature : number and type of arguments and their sequence
	Complex(int r,int i){
		real=r;
		imag=i;
	}
	
	public Complex(){
		real=5;
		imag=6;
	}
	
	private Complex(int real){
		this.real=real;
		imag=9;
	}
	public void inputComplexNo(int r,int i){
		real=r;
		imag=i;
	}
	
	public void display(){
		System.out.print(real);
		if(imag>0)
			System.out.println("+"+imag+"i");
		else
			System.out.println(imag+"i");
	}
	
	public void addComplex(Complex c1,Complex c2){
		real=c1.real+c2.real;
		imag=c1.imag+c2.imag;
	}
	
	public Complex getComplexNumber(){
		return new Complex(4);
		
	}
}
