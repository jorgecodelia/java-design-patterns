package com.patterns.structural.decorator;

import com.patterns.structural.decorator.decorator.Art;
import com.patterns.structural.decorator.decorator.Science;
import com.patterns.structural.decorator.model.AmericanGirl;
import com.patterns.structural.decorator.model.Girl;

public class Main {

    public static void main(String[] args) {
        Girl g1 = new AmericanGirl();
        System.out.println(g1.getDescription());

        Science g2 = new Science(g1);
        System.out.println(g2.getDescription());

        Art g3 = new Art(g2);
        System.out.println(g3.getDescription());

        //We can also do something like this:
        Girl g = new Art(new Science(new AmericanGirl()));
        System.out.println();
        System.out.println(g.getDescription());
    }
}
