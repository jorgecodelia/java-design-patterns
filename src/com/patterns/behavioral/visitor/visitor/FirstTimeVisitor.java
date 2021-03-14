package com.patterns.behavioral.visitor.visitor;

import com.patterns.behavioral.visitor.model.City;
import com.patterns.behavioral.visitor.model.Museum;
import com.patterns.behavioral.visitor.model.Park;

public class FirstTimeVisitor implements Visitor {

    @Override
    public void visit(City city) {
        System.out.println("I'm visiting the city!");
    }

    @Override
    public void visit(Museum museum) {
        System.out.println("I'm visiting the Museum!");
    }

    @Override
    public void visit(Park park) {
        System.out.println("I'm visiting the Park!");
    }
}
