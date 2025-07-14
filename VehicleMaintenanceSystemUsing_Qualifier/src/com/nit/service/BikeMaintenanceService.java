package com.nit.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component("bikeService")
public class BikeMaintenanceService implements MaintenanceService{

	@Override
	public void performService() {
		System.out.println("BikeMaintenanceService.performService()");
		
	}

}
