package com.patterns.creational.builder;

import com.patterns.creational.builder.builder.CoffeeBuilder;
import com.patterns.creational.builder.builder.StarbucksBuilder;
import com.patterns.creational.builder.director.Waiter;
import com.patterns.creational.builder.model.Starbucks;

public class Customer {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        StarbucksBuilder coffeeBuilder = new CoffeeBuilder();

        //Alternatively you can use tea builder to build a tea
        //StarbucksBuilder teaBuilder = new TeaBuilder();

        waiter.setStarbucksBuilder(coffeeBuilder);
        waiter.constructStarbucks();

        //get the drink built
        Starbucks drink = waiter.getStarbucksDrink();

    }
}
