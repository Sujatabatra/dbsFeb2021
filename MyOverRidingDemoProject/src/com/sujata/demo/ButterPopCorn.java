package com.sujata.demo;

public class ButterPopCorn extends PopCorn {

	/*OverRiding
	 * 1. function name and arguments must be same
	 * 2. function can be overridden either on the same scope or on broader scope we can't narrow down the scope while overriding
	*/
	public void pop(){
		System.out.print("Butterly ");
		super.pop();
	}
	
	public void butterQuantity(int ounce){
		System.out.println(ounce+" ounces of butter added to the popcorn!");
	}
//	public void letgoPopping(){
//		super.pop();
//	}
}
