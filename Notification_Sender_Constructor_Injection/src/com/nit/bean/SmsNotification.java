package com.nit.bean;

public class SmsNotification implements NotificationService {

	
	
	@Override
	public void sendingmessages() {
		System.out.println("Sendin SMS Notification");

	}

}
