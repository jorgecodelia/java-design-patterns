package com.patterns.creational.abstractFactory.model;

public class IntelCPU implements CPU {
    @Override
    public void process() {
        System.out.println("Intel is processing...");
    }
}
