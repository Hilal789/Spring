package com.main;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.LogManager;
import com.config.AppConfig;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
		
		LogManager bean = con.getBean(LogManager.class);
		
			bean.dis();
	}

}
