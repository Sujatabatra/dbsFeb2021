package com.sujata.demo;

/*
 * synchronized is used to put lock
 * two kinds of lock class level and object level
 * 
 * synchronized can be a block or a method
 * with synchronized block we can select to put class as well as object level locking depending on the need
 * with synchronised method 
 * if method is static , then class level locking is applicable
 * if method is instance , then object level locking is applicable
 * to understand the meaning of object and class level locking refer synchronized2.png file
 */
class Account implements Runnable{

	
	private static int balance=1000;
	
//	public void withdrawl(){
//		if(balance>800){
//			System.out.println(Thread.currentThread().getName()+" you have sufficient balance to withdrawl and ur balance is Rs."+balance);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			balance=balance-800;
//		}
//		else{
//			System.out.println(Thread.currentThread().getName()+" you don't have sufficient balance to withdrawl and ur balance is Rs."+balance);
//		}
//	}

	//Object level as run method is instance method
	synchronized public void run(){
//		withdrawl();
		//synchronized block : class level lock 
//		synchronized (Account.class) {
		//synchronized block : object level locking
//		synchronized (this) {
		if(balance>800){
			System.out.println(Thread.currentThread().getName()+" you have sufficient balance to withdrawl and ur balance is Rs."+balance);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance=balance-800;
			System.out.println(Thread.currentThread().getName()+" your balance after withdrawl is Rs."+balance);
		}
		else{
			System.out.println(Thread.currentThread().getName()+" you don't have sufficient balance to withdrawl and ur balance is Rs."+balance);
		}
//		}
	}
}
public class MyAccountDemoClass {

	public static void main(String[] args) {
		Account a001=new Account();
//		Account a002=new Account();
		
		Thread ravi=new Thread(a001, "Ravi");
		Thread varun=new Thread(a001,"Varun");
		
		ravi.start();
		varun.start();

	}

}
