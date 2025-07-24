package com.nit.bean;

import org.springframework.stereotype.Component;

@Component
public class ElectricEngine implements Engine {
    public String getEngineType() {
        return "Electric";
    }
}