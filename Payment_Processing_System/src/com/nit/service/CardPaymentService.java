package com.nit.service;

import org.springframework.stereotype.Component;

@Component("card")
public class CardPaymentService implements PaymentService{

	@Override
	public void processPayments(double amount) {
		System.out.println("Payment Via Card ........"+amount);
		
	}

}
