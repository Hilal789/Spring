package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.bean.WishMessageGenerator;

public class Test {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext con = new FileSystemXmlApplicationContext(
				"src/com/nit/config/AplicationContext.xml");
		WishMessageGenerator bean = con.getBean(WishMessageGenerator.class);
		String message = bean.message();
		System.out.println(message);

	}

}
