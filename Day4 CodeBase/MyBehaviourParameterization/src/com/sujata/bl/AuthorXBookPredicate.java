package com.sujata.bl;

import com.sujata.demo.Book;

public class AuthorXBookPredicate implements BookPredicate {

	@Override
	public boolean test(Book book) {
		
		return book.getAuthorName().equalsIgnoreCase("Author X");
	}

}
