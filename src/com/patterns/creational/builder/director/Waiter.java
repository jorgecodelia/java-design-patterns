package com.patterns.creational.builder.director;

import com.patterns.creational.builder.builder.StarbucksBuilder;
import com.patterns.creational.builder.model.Starbucks;

public class Waiter {
    private StarbucksBuilder starbucksBuilder;

    public void setStarbucksBuilder(StarbucksBuilder builder) {
        starbucksBuilder = builder;
    }

    public Starbucks getStarbucksDrink() {
        return starbucksBuilder.getStarbucks();
    }

    public void constructStarbucks() {
        starbucksBuilder.createStarbucks();
        starbucksBuilder.buildDrink();
        starbucksBuilder.buildSize();
    }
}
