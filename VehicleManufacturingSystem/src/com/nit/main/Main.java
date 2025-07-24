package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.bean.VehicleService;
import com.nit.config.AppConfig;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        VehicleService service = context.getBean(VehicleService.class);

        // Simulate user input
        String description = service.createVehicle("Car", "Electric");
        System.out.println(description);

        context.close();
    }
}