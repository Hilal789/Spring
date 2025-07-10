package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleWorkshop {

	@Autowired
//	@Qualifier("bikeService")
	private MaintenanceService ms;
	
	
	public void getService()
	{
		ms.performService();
	}
	
}
