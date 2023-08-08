package com.example.demospringaop.services;

import org.springframework.stereotype.Component;

@Component
public class BridgeTyres implements Tyres {
    @Override
    public void rotate() {
        System.out.println("rotating Mechelin Tyres");
    }
}
