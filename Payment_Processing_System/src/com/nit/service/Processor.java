package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Processor {

	PaymentService payment;

	@Autowired

	public Processor(@Qualifier("upi") PaymentService payment) {
		super();
		this.payment = payment;
	}

	public void makePayment(double amount) {
		payment.processPayments(amount);

	}

}
