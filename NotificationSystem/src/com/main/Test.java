package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.NotificationSystem;
import com.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);

		NotificationSystem bean = con.getBean(NotificationSystem.class);
		
		bean.dis();
		bean.disSet();

	}

}
