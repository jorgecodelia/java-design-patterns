package com.patterns.creational.factory.model;

public class Girl implements Human{
    @Override
    public void Talk() {
        System.out.println("Girl is talking...");
    }

    @Override
    public void walk() {
        System.out.println("Girl is walking...");
    }
}
