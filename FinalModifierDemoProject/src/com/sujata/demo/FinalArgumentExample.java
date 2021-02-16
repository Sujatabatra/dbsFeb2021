package com.sujata.demo;

class FinalDemo{
	public void myMethod(int num1,int num2){
		num1=num1+10;
		num2=num2+10;
	}
	
	public void factorial(final int num){
		int f=1;
		int n=num;
		while(n!=0){
			f*=n--;
		}
		System.out.println("Factorial of "+num+" = "+f);
	}
}
public class FinalArgumentExample {

	public static void main(String[] args) {
		FinalDemo fd=new FinalDemo();
		fd.myMethod(10, 5);
		
		fd.factorial(5);
		

	}

}
