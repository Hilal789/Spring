package com.nit.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    private VehicleFactory vehicleFactory;

    public String createVehicle(String type, String engineType) {
        Vehicle vehicle = vehicleFactory.createVehicle(type, engineType);
        return vehicle.getDescription();
    }
}