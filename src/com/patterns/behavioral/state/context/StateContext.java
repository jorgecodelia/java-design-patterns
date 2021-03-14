package com.patterns.behavioral.state.context;

import com.patterns.behavioral.state.model.Poor;
import com.patterns.behavioral.state.model.State;

public class StateContext {
    private State currentState;

    public StateContext(){
        currentState = new Poor();
    }

    public void changeState(State newState){
        this.currentState = newState;
    }

    public void saySomething(){
        this.currentState.saySomething(this);
    }
}
