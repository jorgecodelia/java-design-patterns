package com.patterns.behavioral.template;

import com.patterns.behavioral.template.model.Car;
import com.patterns.behavioral.template.model.Truck;
import com.patterns.behavioral.template.model.Vehicle;

public class Main {
    public static void main(String args[]){
        Car car = new Car();
        testVehicle(car);

        Truck truck = new Truck();
        testVehicle(truck);
    }

    public static void testVehicle(Vehicle v){
        v.testYourVehicle();
    }
}
