package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.service.VehicleWorkshop;

public class Tester {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		VehicleWorkshop wrk = ctx.getBean(VehicleWorkshop.class);
		wrk.getService();
	}

}
