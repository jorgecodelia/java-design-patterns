package com.patterns.behavioral.visitor.visitor;

import com.patterns.behavioral.visitor.model.City;
import com.patterns.behavioral.visitor.model.Museum;
import com.patterns.behavioral.visitor.model.Park;

public interface Visitor {
    public void visit(City city);
    public void visit(Museum museum);
    public void visit(Park park);
}
