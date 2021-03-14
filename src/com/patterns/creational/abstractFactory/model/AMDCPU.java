package com.patterns.creational.abstractFactory.model;

public class AMDCPU implements CPU {
    @Override
    public void process() {
        System.out.println("AMD is processing...");
    }
}
