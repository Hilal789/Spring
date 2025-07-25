package com.nit.bean;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
@Component
public class MessagePrinter {
	@Autowired
	private LocaleSelector localeSelector;
	
	private final MessageSource messageSource;
	
	 public MessagePrinter(MessageSource messageSource) {
		super();
		this.messageSource = messageSource;
		
	 }
	 
	 
	 
	 
	 public void printMsg() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter your name: ");
		 String name = sc.nextLine();
		 Locale locale = localeSelector.localSelector();
		 
		 String greeting = messageSource.getMessage("greeting", new Object[]{name}, locale);
	        String farewell = messageSource.getMessage("farewell", null, locale);
	        String dateFormatted = messageSource.getMessage("date.format", new Object[]{new Date()}, locale);

	        System.out.println(greeting);
	        System.out.println(dateFormatted);
	        System.out.println(farewell);

		 
	 }

}
