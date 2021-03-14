package com.patterns.creational.builder.builder;

import com.patterns.creational.builder.builder.StarbucksBuilder;

public class TeaBuilder extends StarbucksBuilder {
    @Override
    public void buildSize() {
        starbucks.setSize("large");
        System.out.println("build large size");
    }

    @Override
    public void buildDrink() {
        starbucks.setDrink("tea");
        System.out.println("build tea");
    }
}
