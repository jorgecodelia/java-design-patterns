package com.patterns.creational.factory.model;

public class Boy implements Human {
    @Override
    public void Talk() { System.out.println("Boy is talking..."); }

    @Override
    public void walk() { System.out.println("Boy is walking..."); }
}
