package com.sujata.demo;

class MySecondThread extends Thread{
	
	public MySecondThread(){
		super(); //Thread() constructor
	}
	public MySecondThread(String name){
		super(name); //Thread(String) constructor
	}
	@Override
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println(Thread.currentThread().getName()+" says good bye!");
	}
}
public class MySecondDemoClass {

	//main: only Thread
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" Welcomes you");
		
		MySecondThread thread1=new MySecondThread();  //New Born: Thread0
		MySecondThread thread2=new MySecondThread();  //Thread1
		MySecondThread thread3=new MySecondThread("ThirdThread"); 
		MySecondThread thread4=new MySecondThread(); //Thread2
		
		System.out.println("Hi I'"+Thread.currentThread().getName()+"' am new parents of 4 Threads");
		
		thread2.setName("SecondThread");
		
		thread1.start(); //Thread started its fight to get processor time (i.e in ready/running state)
		thread2.start();
		thread3.start();
		thread4.start();
		
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println(Thread.currentThread().getName()+" says good bye!");
		

	}

}
