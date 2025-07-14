package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.Employee;
import com.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee bean = con.getBean(Employee.class);
		
		System.out.println(bean);		
		
		

	}

}
