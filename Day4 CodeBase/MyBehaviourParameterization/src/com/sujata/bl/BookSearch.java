package com.sujata.bl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.sujata.demo.Book;

public class BookSearch {

	public ArrayList<Book> searchBookByAuthorX(ArrayList<Book> books){
		ArrayList<Book> newList=new ArrayList<>();
		for(Book book:books){
			if(book.getAuthorName().equals("Author X"))  //Behaviour
				newList.add(book);
		}
		return newList;
	}
	
	public ArrayList<Book> searchThickBook(ArrayList<Book> books){
		ArrayList<Book> newList=new ArrayList<>();
		for(Book book:books){
			if(book.getNoOfPages()>1000) //Behaviour
				newList.add(book);
		}
		return newList;
	}
	
	public ArrayList<Book> searchExpensiveBook(ArrayList<Book> books){
		ArrayList<Book> newList=new ArrayList<>();
//		for(Book book:books){
//			if(book.getPrice()>800)  //Behaviour
//				newList.add(book);
//		}
//		
		newList=(ArrayList<Book>)books.stream()
				.filter(book->book.getPrice()>800)
				.collect(Collectors.toList());
		return newList;
	}
	
	//Behaviour Parameterization
	public ArrayList<Book> searchBook(ArrayList<Book> books,BookPredicate behaviour){
		ArrayList<Book> newList=new ArrayList<>();
//		for(Book book:books){
//			if(behaviour.test(book))
//				newList.add(book);
//		}
		
		newList=(ArrayList<Book>)books.stream()
		.filter(behaviour::test)
		.collect(Collectors.toList());
		return newList;
	}
	
	
	public ArrayList<Book> searchBookUsingPredefinedFunctionalInterface(ArrayList<Book> books,Predicate<Book> behaviour){
		ArrayList<Book> newList=new ArrayList<>();
//		for(Book book:books){
//			if(behaviour.test(book))
//				newList.add(book);
//		}
		
//		newList=(ArrayList<Book>))books.stream()
//				.filter(book->behaviour.test(book))
//				.collect(Collectors.toList());
		
		newList=(ArrayList<Book>)books.stream()
		.filter(behaviour::test)
		.collect(Collectors.toList());
		
		return newList;
	}
	
	
	
}
