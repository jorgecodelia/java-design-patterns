package com.patterns.behavioral.strategy.model;

public class HardPolice implements Strategy {
    @Override
    public void processSpeeding(int speed) {
        System.out.println("Your speed is "+ speed+ ", and should get a ticket!");
    }
}
