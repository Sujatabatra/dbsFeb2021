package com.sujata.demo;

import javax.swing.text.InternationalFormatter;

class InputNumber{
	private int number;

	public InputNumber(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
	
}

class Iteration extends InputNumber implements Runnable{

	public Iteration(int number) {
		super(number);
	}
	
	public void perform(){
		for(int i=1;i<5;i++){
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
	}

	//Job of a Thread
	@Override
	public void run() {
		perform();
		System.out.println("Good Bye from "+Thread.currentThread().getName()+" !!!");
	}
	
}
public class MyThirdDemoClass {

	public static void main(String[] args) {
		
		Iteration job=new Iteration(5);
		
		Thread thread1=new Thread(job); //new born :0
		Thread thread2=new Thread(job); //new born :1
		Thread thread3=new Thread(job,"ThirdThread"); //new born
		Thread thread4=new Thread(job); //new born :2
		
		thread2.setName("SecondThread");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		for(int i=1;i<5;i++){
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName()+" !!!");
	}

}
