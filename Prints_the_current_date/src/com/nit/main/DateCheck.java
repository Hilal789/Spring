package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.bean.CurrentDate;

public class DateCheck {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext file = new FileSystemXmlApplicationContext("src\\com\\nit\\config\\AplicationContext.xml");
			
		
		Object bean = file.getBean("d");
		
		CurrentDate cd = (CurrentDate) bean;
		
		String result  = cd.PrintCurrentDate("Hilal  ");
		
		System.out.println(result);

		file.close();
		
		
		
	}

}
