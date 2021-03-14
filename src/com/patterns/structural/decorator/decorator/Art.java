package com.patterns.structural.decorator.decorator;

import com.patterns.structural.decorator.model.Girl;

public class Art extends GirlDecorator {

    private Girl girl;

    public Art(Girl g) {
        girl = g;
    }

    @Override
    public String getDescription() {
        return girl.getDescription() + "+Like Art";
    }

    public void draw() {
        System.out.println("draw pictures!");
    }
}
