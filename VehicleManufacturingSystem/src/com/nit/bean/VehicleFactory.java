package com.nit.bean;

public interface VehicleFactory {
	Vehicle createVehicle(String type, String engineType);
}