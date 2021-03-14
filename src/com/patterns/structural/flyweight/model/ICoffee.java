package com.patterns.structural.flyweight.model;

import com.patterns.structural.flyweight.context.CoffeeContext;

// Flyweight object interface
public interface ICoffee {
    public void serveCoffee(CoffeeContext context);
}
