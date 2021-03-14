package com.patterns.structural.flyweight.factory;

import com.patterns.structural.flyweight.model.Coffee;

import java.util.HashMap;

//The FlyweightFactory!
public class CoffeeFactory {
    private final HashMap<String, Coffee> flavors = new HashMap<>();

    public Coffee getCoffeeFlavor(String flavorName) {
        Coffee flavor = flavors.get(flavorName);
        if (flavor == null) {
            flavor = new Coffee(flavorName);
            flavors.put(flavorName, flavor);
        }
        return flavor;
    }

    public int getTotalCoffeeFlavorsMade() {
        return flavors.size();
    }
}