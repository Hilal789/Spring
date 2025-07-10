package com.nit.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("carService")
public class CarMaintenanceService implements MaintenanceService{

	@Override
	public void performService() {
		
		System.out.println("CarMaintenanceService.performService()");
	}

}
