package com.nit.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.bean.NotificationSender;
import com.nit.bean.NotificationService;



public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		//FileSystemXmlApplicationContext con = new FileSystemXmlApplicationContext("src/com/nit/config/AplicationContext.xml");

		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("AplicationContext.xml");
		
		
		
		NotificationSender bean = (NotificationSender) c.getBean("SetSms");
		bean.send();
	

		
//		NotificationSender bean  = c.getBean(NotificationSender.class);
//		
//		bean.ns.sendingmessages();
//	


	}

}
