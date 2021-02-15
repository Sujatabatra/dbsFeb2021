package com.training.demo;

import com.sujata.training.SecondClass;

public class MyDemoMain {

	public static void main(String[] args) {
		SecondClass sOb=new SecondClass();
		sOb.display();
//		Default package can't be imported, so even if classes are pubvlic we won't be able to make use of those classes outside default package
//		SujataClass sOb=new SujataClass();

	}

}
