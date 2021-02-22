package com.sujata.demo;

import java.util.ArrayList;

import com.sujata.bl.AuthorXBookPredicate;
import com.sujata.bl.BookPredicate;
import com.sujata.bl.BookSearch;
import com.sujata.bl.ExpensiveBookPredicate;

public class MyBookMain {

	public static void main(String[] args) {
		ArrayList<Book> bookList=new ArrayList<>();
		
		bookList.add(new Book(101, "Head First Java", "Bert Bates", 890, 1200));
		bookList.add(new Book(102,"Action in Spring","Craig Walls",1200,950));
		bookList.add(new Book(103,"Learn Java in 21 Days","Author X",750,550));
		bookList.add(new Book(104,"Java Black Book","Author A",800,1950));
		bookList.add(new Book(105,"Learn Spring in 21 Days","Author X",1000,1300));
		bookList.add(new Book(106,"Spring Made Easy","Author X",1600,1250));
		
		System.out.println(bookList);

		BookSearch  bookSearch=new BookSearch();
		ArrayList<Book> listOfBookByAuthorX=bookSearch.searchBookByAuthorX(bookList);
		System.out.println(listOfBookByAuthorX);

		
		System.out.println("============================");

		ArrayList<Book> listOfExpensiveBooks=bookSearch.searchBook(bookList, new ExpensiveBookPredicate());
		System.out.println(listOfExpensiveBooks);
		
		System.out.println("============================");
		
		ArrayList<Book> listOfAuthorXBooks=bookSearch.searchBook(bookList, new AuthorXBookPredicate());
		System.out.println(listOfAuthorXBooks);
		
		//we have the concept of Anonymous Inner Class class Having no name
		
		//reference Variable :interface 
		BookPredicate predicate;
		//interface reference variable=new classname();
		//interface reference variable=new defination of class(){}
		
		/*
		 * with Anonymous class we are telling the compiler the implementation of abstract method of respective interface without giving any class name
		 */
		predicate=new BookPredicate() {
			@Override
			public boolean test(Book book) {
				return book.getNoOfPages()>1000;
			}
		};

//		ArrayList<Book> expensiveBookList=bookSearch.searchBook(bookList, predicate);
		
		ArrayList<Book> expensiveBookList=bookSearch.searchBook(bookList,new BookPredicate() {
			@Override
			public boolean test(Book book) {
				return book.getNoOfPages()>1000;
			}});
		
		ArrayList<Book> expensiveBookList1=bookSearch.searchBook(bookList,book-> book.getNoOfPages()>1000);
		
	}

}
