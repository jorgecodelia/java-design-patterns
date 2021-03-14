package com.patterns.behavioral.template.model;

public class Truck extends Vehicle {

    @Override
    void start() {
        this.status = true;
    }

    @Override
    void run() {
        System.out.println("Truck Run slowly!");
    }

    @Override
    void stop() {
        System.out.println("Truck stop!");

    }
}
