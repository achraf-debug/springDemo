package com.example.demospringaop.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MechelinTyres implements Tyres{
    @Override
    public void rotate() {
        System.out.println("rotating Mechelin Tyres");
    }
}
