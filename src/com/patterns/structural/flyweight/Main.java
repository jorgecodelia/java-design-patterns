package com.patterns.structural.flyweight;

import com.patterns.structural.flyweight.context.CoffeeContext;
import com.patterns.structural.flyweight.factory.CoffeeFactory;
import com.patterns.structural.flyweight.model.Coffee;

//Waitress serving coffee
public class Main {
    //coffee array
    private static final Coffee[] coffees = new Coffee[20];
    //table array
    private static final CoffeeContext[] tables = new CoffeeContext[20];
    private static int ordersCount = 0;
    private static CoffeeFactory coffeeFactory;

    public static void takeOrder(String flavorIn, int table) {
        coffees[ordersCount] = coffeeFactory.getCoffeeFlavor(flavorIn);
        tables[ordersCount] = new CoffeeContext(table);
        ordersCount++;
    }

    public static void main(String[] args) {
        coffeeFactory = new CoffeeFactory();

        takeOrder("Cappuccino", 2);
        takeOrder("Cappuccino", 2);
        takeOrder("Regular Coffee", 1);
        takeOrder("Regular Coffee", 2);
        takeOrder("Regular Coffee", 3);
        takeOrder("Regular Coffee", 4);
        takeOrder("Cappuccino", 4);
        takeOrder("Cappuccino", 5);
        takeOrder("Regular Coffee", 3);
        takeOrder("Cappuccino", 3);

        for (int i = 0; i < ordersCount; ++i) {
            coffees[i].serveCoffee(tables[i]);
        }

        System.out.println("\nTotal Coffee objects made: " +  coffeeFactory.getTotalCoffeeFlavorsMade());
    }
}
