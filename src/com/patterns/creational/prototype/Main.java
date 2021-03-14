package com.patterns.creational.prototype;

import com.patterns.creational.prototype.model.A;
import com.patterns.creational.prototype.model.Prototype;

//when we need a large number of similar objects
public class Main {
    public static void main(String args[]) throws CloneNotSupportedException {
        A a = new A(1);

        for (int i = 2; i < 10; i++) {
            Prototype temp = a.clone();
            temp.setSize(i);
            temp.printSize();
        }
    }
}
