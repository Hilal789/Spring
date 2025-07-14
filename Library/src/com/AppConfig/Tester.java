package com.AppConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.library.Library;

public class Tester {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Library bean = ctx.getBean(Library.class);
		
		bean.showBook();
		
		
	}

}
