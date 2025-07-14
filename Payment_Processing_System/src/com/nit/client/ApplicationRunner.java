package com.nit.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.service.Processor;

public class ApplicationRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext con = new  AnnotationConfigApplicationContext(AppConfig.class);
		
		Processor bean = con.getBean(Processor.class);
		bean.makePayment(200);
  
	}

}
