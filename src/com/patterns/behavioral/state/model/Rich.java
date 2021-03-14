package com.patterns.behavioral.state.model;

import com.patterns.behavioral.state.context.StateContext;

public class Rich implements State{
    @Override
    public void saySomething(StateContext sc) {
        System.out.println("I'm rick currently, and play a lot.");
        sc.changeState(new Poor());
    }
}
