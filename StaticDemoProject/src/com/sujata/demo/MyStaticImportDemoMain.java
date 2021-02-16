package com.sujata.demo;

//import all the static member of the mentioned class : so that to call those static members we need not to use class name 
import static com.sujata.training.MyStaticImportDemo.*;


import com.sujata.training.MyStaticImportDemo;

public class MyStaticImportDemoMain {

	public static void main(String[] args) {
		showFive();

		showTwo();
		
		showFour();
		
		MyStaticImportDemo ob=new MyStaticImportDemo();
		ob.showOne();
	}

}
