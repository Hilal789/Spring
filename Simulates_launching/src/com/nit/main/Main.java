package com.nit.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.bean.Launcher;
import com.nit.config.AppConfig;


public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("main");
			Launcher ln = con.getBean(Launcher.class);
			ln.launch();
	}

}
