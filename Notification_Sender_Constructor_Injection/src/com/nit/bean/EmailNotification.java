package com.nit.bean;

public class EmailNotification implements NotificationService{
	
	
	@Override
	public void sendingmessages() {
		System.out.println("Email Notification ");
		
	}
}
