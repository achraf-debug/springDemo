package com.example.demospringaop.services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeaker implements Speakers {

    @Override
    public void makeSound() {
        System.out.println("making sound through the sony speaker ");
    }
}
