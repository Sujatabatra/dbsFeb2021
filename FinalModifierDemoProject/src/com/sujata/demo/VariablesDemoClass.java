package com.sujata.demo;

class Demo{
	//Instance Variable : gets default initial value (Default Constructor)->Compiler,Heap
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void doSomething(){
		/*Local Variable : it doesn't get default initial value , Stack
		that is why before using local variable we need to initialise it, otherwise compiler will report an error
		if you are making local variable as final , initialization will be allowed just once 
		*/
		
		final String str;
		System.out.println("name : "+name);
		str="Hi";
//		str="Bye";
		System.out.println("str : "+str);
		
	}
	
}
public class VariablesDemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
