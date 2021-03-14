package com.patterns.behavioral.template.model;

public class Car extends Vehicle {

    @Override
    void start() {
        this.status = true;
    }

    @Override
    void run() {
        System.out.println("Car Run fast!");

    }

    @Override
    void stop() {
        System.out.println("Car stop!");
    }
}
