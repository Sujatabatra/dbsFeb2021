package com.sujata.demo;

public class Book {

	private int BookId;
	private String bookName;
	private String authorName;
	private int noOfPages;
	private int price;
	
	public Book(){
		
	}
	public Book(int bookId, String bookName, String authorName, int noOfPages, int price) {
		super();
		BookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.noOfPages = noOfPages;
		this.price = price;
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [BookId=" + BookId + ", bookName=" + bookName + ", authorName=" + authorName + ", noOfPages="
				+ noOfPages + ", price=" + price + "]";
	}
	
	
	
}
