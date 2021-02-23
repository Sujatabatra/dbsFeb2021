package com.sujata.concurrecncy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import java.util.Date;
import java.util.concurrent.Callable;

//Job of a Thread and job which returns status too
class CallableDemo implements Callable<String> {

	private String name;

	public CallableDemo(String name) {
		super();
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello " + name + " you are here at " + new Date();
	}

}

public class MyThirdExample {

	public static void main(String[] args) {
		//collection of future to capture mutiple return values from multiple tasks being assigned to ThreadPool
		List<Future<String>> futureList = new ArrayList<Future<String>>();

		//collection of multiple tasks which we are supposed to give to thread pool to perform
		List<CallableDemo> taskList = new ArrayList<CallableDemo>();
		//adding multiple tasks to collection (tasks are created using 'Callable' Interface.
		taskList.add(new CallableDemo("first"));
		taskList.add(new CallableDemo("second"));
		taskList.add(new CallableDemo("third"));
		taskList.add(new CallableDemo("fourth"));
		taskList.add(new CallableDemo("fifth"));
		taskList.add(new CallableDemo("sixth"));
		taskList.add(new CallableDemo("seventh"));

		//creating a thread pool of size four
		ExecutorService threadPool = Executors.newFixedThreadPool(4);
		
		for (CallableDemo task : taskList) {
			futureList.add(threadPool.submit(task));
		}
        threadPool.shutdown();
		for (Future<String> future : futureList) {
			try {
//				 System.out.println(future.get());
				System.out.println(future.get(1L, TimeUnit.SECONDS));
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (TimeoutException e) {
				System.out.println("Sorry already waited for result for 1 second , can't wait anymore...");
			}

		}
	}
}