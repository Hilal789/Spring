package com.nit.bean;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	public void start(String fuelType, int temp, int pressure) {
		if (isFuelValid(fuelType) && checkTemp(temp) && tyrePressure(pressure)) {
			System.out.println("Car started successfully!\r\n" + "Engine started!!");
		} else {
			System.out.println("Engine failed to start!\r\n" + "");
		}
	}

	public boolean isFuelValid(String fuelType) {
		if (fuelType.equalsIgnoreCase("petrol")) {
			return true;
		} else
			return false;
	}

	public boolean checkTemp(int temp) {
		if (temp <= 30) {
			return true;
		} else {
			return false;
		}
	}

	public boolean tyrePressure(int pressure) {
		if (pressure >= 35 && pressure <= 40) {
			return true;
		} else {
			return false;
		}
	}

}
