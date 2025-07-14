package com.nit.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.bean.Account;

public class Tester {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("com/nit/config/AplicationContext.xml");
		Account bean = con.getBean("Acc",Account.class);
		System.out.println(bean);
		
		
		
	}

}
