package com.patterns.behavioral.visitor;

import com.patterns.behavioral.visitor.model.City;
import com.patterns.behavioral.visitor.visitor.FirstTimeVisitor;

public class Main {
    public static void main(String[] args) {
        FirstTimeVisitor visitor = new FirstTimeVisitor();
        City city = new City();
        city.accept(visitor);
    }
}
