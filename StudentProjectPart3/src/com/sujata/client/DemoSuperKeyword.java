package com.sujata.client;

class Parent{
	int i;

	public Parent(int i) {
		super();
		this.i = i;
	}
	
}

class Child extends Parent{
	int i;

	public Child(int i, int i2) {
		super(i);
		this.i = i2;
	}
	public void greater(){
		
		if(super.i>i)
			System.out.println(super.i +" from parent is greater");
		else
			System.out.println(i+" from child is greater");
	}
}
public class DemoSuperKeyword {

	public static void main(String[] args) {
		Child child=new Child(10, 20);
		child.greater();
	}

}
