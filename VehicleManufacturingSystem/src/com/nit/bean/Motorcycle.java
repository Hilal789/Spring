package com.nit.bean;

public class Motorcycle implements Vehicle {
    private Engine engine;
    private boolean hasSidecar;

    public Motorcycle(Engine engine, boolean hasSidecar) {
        this.engine = engine;
        this.hasSidecar = hasSidecar;
    }

    public String getDescription() {
        return "Motorcycle with " + engine.getEngineType() + " engine" + (hasSidecar ? " and a sidecar." : ".");
    }
}