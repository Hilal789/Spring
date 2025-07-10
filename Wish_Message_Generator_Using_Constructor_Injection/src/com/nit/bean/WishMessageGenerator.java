package com.nit.bean;

import java.time.LocalTime;

public class WishMessageGenerator {
	private LocalTime time;

	public WishMessageGenerator(LocalTime time) {
		this.time = time;
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
