package com.example.demospringaop.services;


import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speakers {
    @Override
    public void makeSound() {
        System.out.println("making sound through the Bose speaker");
    }
}
