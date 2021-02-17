package com.sujata.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class MyArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> myList=new ArrayList<>();
		
		myList.add("First");
		myList.add("Second");
		myList.add("Third");
		myList.add("Fourth");
		myList.add("Second");
		
		System.out.println(myList);
		System.out.println("ToTal elements : "+myList.size());
		String val=myList.remove(2);
		System.out.println("Value Removed from 2nd index "+val);
		System.out.println("ToTal elements : "+myList.size());
		System.out.println("Travesal using Traditional for loop");
		//Traditional for loop
		for(int index=0;index<myList.size();index++){
			System.out.println(myList.get(index));
		}
		
		System.out.println("Traversal using for each loop");
		for(String value:myList){
			System.out.println(value);
		}
		
		System.out.println("Travesal using Iterator Interface");
		//creation of object is doing someone else for us , we call it as Factory Design Pattern
		//iterator() method is returning the object of a class which is the child class of Iterator Interface
		//Iterator interface : allows Uni-directional traversal (forward travesal) 
		Iterator<String> it=myList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("Reverse Traversal using ListIterator");
		ListIterator<String> li=myList.listIterator();
		while(li.hasNext())
			li.next();
		while(li.hasPrevious())
			System.out.println(li.previous());
		
		
		
		
		
	}

}
