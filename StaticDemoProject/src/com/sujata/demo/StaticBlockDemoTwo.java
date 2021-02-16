package com.sujata.demo;

class DemoBase {

	static {
		System.out.println("Hi I am DemoBase class static Block ");
	}

	{
		System.out.println("Hi I am DemoBase class instance Block 1");
	}

	DemoBase() {
		System.out.println("Hi I am DemoBase class default Constructor");
	}

}

class DemoDerived extends DemoBase{
	static {
		System.out.println("Hi I am DemoDerived class static Block ");
	}

	{
		System.out.println("Hi I am DemoDerived class instance Block 1");
	}

	DemoDerived() {
		System.out.println("Hi I am DemoDerived class default Constructor");
	}
}
public class StaticBlockDemoTwo {

	public static void main(String[] args) {

		DemoBase d=new DemoBase();
		System.out.println("============");
		DemoDerived dOb=new DemoDerived();
	}

}
