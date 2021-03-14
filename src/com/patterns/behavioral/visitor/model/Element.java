package com.patterns.behavioral.visitor.model;

import com.patterns.behavioral.visitor.visitor.Visitor;

public interface Element {
    public void accept(Visitor visitor);
}
