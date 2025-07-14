package com.bean;

import org.springframework.stereotype.Component;

@Component("fed")
public class FedExService implements ShippingService{

	@Override
	public void shipPackage() {
		System.out.println("FedEx Service -----");
		
	}

}
