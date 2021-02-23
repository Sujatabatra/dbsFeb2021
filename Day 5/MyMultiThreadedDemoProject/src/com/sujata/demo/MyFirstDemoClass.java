package com.sujata.demo;

class MyFirstThread extends Thread{
	
	@Override
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println(Thread.currentThread().getName()+" says good bye!");
	}
}
public class MyFirstDemoClass {

	//main: only Thread
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" Welcomes you");
		
		MyFirstThread thread1=new MyFirstThread();  //New Born
		MyFirstThread thread2=new MyFirstThread();
		MyFirstThread thread3=new MyFirstThread();
		MyFirstThread thread4=new MyFirstThread();
		
		System.out.println("Hi I'"+Thread.currentThread().getName()+"' am new parents of 4 Threads");
		
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
