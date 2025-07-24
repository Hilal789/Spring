package com.nit.bean;

public class Car implements Vehicle {
    private Engine engine;
    private int numberOfDoors;

    public Car(Engine engine, int numberOfDoors) {
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
    }

    public String getDescription() {
        return "Car with " + engine.getEngineType() + " engine and " + numberOfDoors + " doors.";
    }
}
