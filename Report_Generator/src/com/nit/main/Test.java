package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.bean.ReportGenerator;
import com.nit.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ReportGenerator bean = con.getBean(ReportGenerator.class);
		bean.Disp();
		
		
	}

}
