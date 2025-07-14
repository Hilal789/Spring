package com.bean;

import org.springframework.stereotype.Component;

@Component("dhl")
public class DhlService implements ShippingService{

	@Override
	public void shipPackage() {
		
		System.out.println("DhlService -------- ");
	}

}
