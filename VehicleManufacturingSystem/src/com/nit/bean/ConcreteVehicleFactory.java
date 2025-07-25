package com.nit.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ConcreteVehicleFactory implements VehicleFactory {

    @Autowired
    private ApplicationContext context;

    @Override
    public Vehicle createVehicle(String type, String engineType) {
        Engine engine;

        if (engineType.equalsIgnoreCase("Electric")) {
            engine = context.getBean(ElectricEngine.class);
        } else if (engineType.equalsIgnoreCase("Diesel")) {
            engine = context.getBean(DieselEngine.class);
        } else {
            throw new IllegalArgumentException("Unsupported engine type: " + engineType);
        }

        switch (type.toLowerCase()) {
            case "car":
                return new Car(engine, 4);
            case "truck":
                return new Truck(engine, 10.0);
            case "motorcycle":
                return new Motorcycle(engine, true);
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
}