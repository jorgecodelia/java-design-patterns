package com.patterns.behavioral.template.model;

abstract public class Vehicle {
    //set to protected so that subclass can access
    protected boolean status;

    abstract void start();
    abstract void run();
    abstract void stop();

    public void testYourVehicle(){
        start();
        if(this.status){
            run();
            stop();
        }
    }
}
