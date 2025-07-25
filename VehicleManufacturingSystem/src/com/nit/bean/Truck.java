package com.nit.bean;

public class Truck implements Vehicle {
    private Engine engine;
    private double payloadCapacity;

    public Truck(Engine engine, double payloadCapacity) {
        this.engine = engine;
        this.payloadCapacity = payloadCapacity;
    }

    public String getDescription() {
        return "Truck with " + engine.getEngineType() + " engine and payload capacity of " + payloadCapacity + " tons.";
    }
}