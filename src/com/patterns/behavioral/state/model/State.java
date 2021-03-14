package com.patterns.behavioral.state.model;

import com.patterns.behavioral.state.context.StateContext;

public interface State {
    public void saySomething(StateContext sc);
}
