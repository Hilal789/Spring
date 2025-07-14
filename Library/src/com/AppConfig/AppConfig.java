package com.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.library.Book;
import com.library.Library;

@Configuration
@ComponentScan(basePackages = "com.library")
public class AppConfig {

	@Bean
	public Book book() {
		return new Book();
	}
	
	public Library library() {
		return new Library(book());
	}
}
