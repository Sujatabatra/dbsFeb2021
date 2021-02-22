package com.sujata.bl;

import com.sujata.demo.Book;

@FunctionalInterface
public interface BookPredicate {

	boolean test(Book book);
}
