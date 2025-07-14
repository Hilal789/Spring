package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShipmentProcessor {
	
	ShippingService ss;
	
	@Autowired
	public ShipmentProcessor(@Qualifier("fed") ShippingService ss) {
		super();
		this.ss = ss;
	}
	
	public void disp() {
		ss.shipPackage();
	}
	
	
	
}
