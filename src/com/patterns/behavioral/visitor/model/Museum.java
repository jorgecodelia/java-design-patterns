package com.patterns.behavioral.visitor.model;

import com.patterns.behavioral.visitor.visitor.Visitor;

public class Museum implements Element {
    @Override
    public void accept(Visitor visitor) {
        System.out.println("Museum is accepting visitor.");
        visitor.visit(this);
    }
}