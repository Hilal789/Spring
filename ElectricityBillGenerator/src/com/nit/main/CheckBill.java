package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.beans.ElectricityBillGenerator;

public class CheckBill {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext file =new FileSystemXmlApplicationContext("src\\com\\nit\\config\\aplicationContext.xml");
		
		Object bean = file.getBean("CheckBill");
		
		ElectricityBillGenerator e = (ElectricityBillGenerator)bean;
		
		double bill = e.generateBill();
		
		System.out.println("Total Electricity Bill: "+bill);
		
	}

}
