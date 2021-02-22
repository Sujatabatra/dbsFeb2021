package com.sujata.bl;

import com.sujata.demo.Book;

public class ExpensiveBookPredicate implements BookPredicate {

	@Override
	public boolean test(Book book) {
		
		return book.getPrice()>800;
	}

}
