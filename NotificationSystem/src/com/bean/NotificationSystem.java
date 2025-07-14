package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationSystem {
	
	SmsSender sms;
	
	
	

	@Autowired
	public void setSms(SmsSender sms) {
		this.sms = sms;
	}


	@Autowired
	public NotificationSystem(SmsSender sms) {
		super();
		this.sms = sms;
	}
	
	
	public void dis() {
	//	System.out.println("con : Send sms via smsSender");
		sms.sms();
	}
	
	public void disSet() {
		//System.out.println("Send sms via sms sender via Seter");
		sms.sms();
	}

}
