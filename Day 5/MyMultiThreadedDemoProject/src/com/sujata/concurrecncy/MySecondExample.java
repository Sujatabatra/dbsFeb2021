package com.sujata.concurrecncy;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Callable<String>{

	private int i;
	
	public Task(int i) {
		super();
		this.i = i;
	}

	@Override
	public String call() throws Exception {
		try{
		Thread.sleep(1000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return Thread.currentThread().getName()+" Hi from callable "+i;
	}
	
}
public class MySecondExample {

	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(5);
		
		Future<String> future=executorService.submit(new Task(1));
		
		System.out.println("Hello Everyone from main to show non blocking execution");
		try {
			System.out.println(future.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}
