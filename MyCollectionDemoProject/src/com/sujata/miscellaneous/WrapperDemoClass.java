package com.sujata.miscellaneous;

public class WrapperDemoClass {

	public static void main(String args[]){
		int x=10;
		Integer x1=new Integer("10");
		
		Character c1=new Character('d');
		System.out.println("x1 : "+x1);
		System.out.println("c1 : "+c1);
		
		if(x==x1)
			System.out.println("x and x1 are equal");
		else
			System.out.println("Not equal");
	}
}
