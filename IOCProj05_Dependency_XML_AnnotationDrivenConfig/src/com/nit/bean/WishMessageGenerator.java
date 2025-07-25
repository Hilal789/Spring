package com.nit.bean;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component("sf")
public class WishMessageGenerator {
	private LocalTime time;

	
	@Autowired
	public WishMessageGenerator(LocalTime time) {
		this.time = time;
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}

	public String message() {

		int hour = time.getHour();
		if (hour < 12) {
			return "Good Morning";
		} else if (hour < 16) {
			return "Good After Noon ";
		} else if (hour < 20) {
			return "Good Evening ";
		}

		else {
			return "Good Night ";
		}

	}

}
