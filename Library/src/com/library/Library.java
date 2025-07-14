package com.library;

import org.springframework.stereotype.Component;

@Component
public class Library {
	
	private Book book;

	public Library(Book book) {
		super();
		this.book = book;
	}
	
	public void showBook() {
		System.out.println("Library has :"+book.getTitle());
	}

}
