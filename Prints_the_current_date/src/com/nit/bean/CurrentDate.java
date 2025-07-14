package com.nit.bean;

import java.time.LocalDate;

public class CurrentDate {
	
	private LocalDate date;

	
	
	public void setDate(LocalDate date) {
		this.date = date;
	}



	public String PrintCurrentDate(String user) {
		return user + "Current Date is " + date;
	}

}
