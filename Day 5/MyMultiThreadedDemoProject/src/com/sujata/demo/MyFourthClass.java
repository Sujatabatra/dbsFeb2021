package com.sujata.demo;

public class MyFourthClass {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(() -> {
			System.out.println(Thread.currentThread().getName() + " Welcomes you ! ");
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + " i : " + i);
			}
			System.out.println("Good Bye from " + Thread.currentThread().getName());
		});

		t1.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " i : " + i);
		}
		System.out.println("Good Bye from " + Thread.currentThread().getName());
	}

}
