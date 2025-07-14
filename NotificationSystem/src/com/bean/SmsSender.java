package com.bean;

import org.springframework.stereotype.Component;

@Component
public class SmsSender implements NotificationSender {

	@Override
	public void sms() {
		System.out.println("SMS send via SMS Sender");
		
	}

}
