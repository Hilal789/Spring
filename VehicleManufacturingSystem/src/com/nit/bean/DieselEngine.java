package com.nit.bean;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements Engine {
    public String getEngineType() {
        return "Diesel";
    }
}
