package com.example.demospringaop.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;

    @Autowired
    private VehicleServices vehicleServices;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
