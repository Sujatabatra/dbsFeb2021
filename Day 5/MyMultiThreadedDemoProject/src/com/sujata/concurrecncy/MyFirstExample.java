package com.sujata.concurrecncy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyFirstExample {

	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(5);
		
		executorService.execute(()->System.out.println(Thread.currentThread().getName()+" welcomes u 1"));
		executorService.execute(()->System.out.println(Thread.currentThread().getName()+" welcomes u 2"));
		executorService.execute(()->
		{System.out.println(Thread.currentThread().getName()+" welcomes u 3");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"wokes up");
			});
		
		executorService.execute(()->System.out.println(Thread.currentThread().getName()+" welcomes u 4"));
		executorService.execute(()->System.out.println(Thread.currentThread().getName()+" welcomes u 5"));
		executorService.execute(()->System.out.println(Thread.currentThread().getName()+" welcomes u 6"));
		executorService.execute(()->System.out.println(Thread.currentThread().getName()+" welcomes u 7"));
		executorService.execute(()->System.out.println(Thread.currentThread().getName()+" welcomes u 8"));
		executorService.execute(()->System.out.println(Thread.currentThread().getName()+" welcomes u 9"));
		executorService.execute(()->System.out.println(Thread.currentThread().getName()+" welcomes u 10"));
		
		executorService.shutdown();
		
		executorService.execute(()->System.out.println(Thread.currentThread().getName()+" welcomes u 11"));
		executorService.execute(()->System.out.println(Thread.currentThread().getName()+" welcomes u 12"));
		
		
	}

}
