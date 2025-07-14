package com.nit.service;

import org.springframework.stereotype.Component;

@Component("upi")
public class UPIPaymentService implements PaymentService{

	@Override
	public void processPayments(double amount) {
		System.out.println("Payment Via UPI ........"+amount);
		
	}

}
