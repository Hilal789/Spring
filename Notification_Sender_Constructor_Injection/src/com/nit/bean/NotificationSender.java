package com.nit.bean;

public class NotificationSender {
//	public NotificationService ns;

	public String sms;

	public NotificationSender() {
		super();
	}

	public void setSms(String sms) {
		this.sms = sms;
	}

//	public void setNs(NotificationService ns) {
//		this.ns = ns;
//	}

//	public NotificationSender(NotificationService ns) {
//
//		this.ns = ns;
//	}

	public void send() {
		System.out.println("sended sms :; " + sms);
	}

}
