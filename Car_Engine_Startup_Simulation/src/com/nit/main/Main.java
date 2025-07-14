package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.nit.bean.Car;
import com.nit.config.AplicationConfig;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AplicationConfig.class);

		Car bean = con.getBean(Car.class);
		bean.drive();

	}

}
