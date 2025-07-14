package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.ShipmentProcessor;
import com.config.AppCon;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AppCon.class);
		
		ShipmentProcessor bean = con.getBean(ShipmentProcessor.class);
		bean.disp();
	}

}
