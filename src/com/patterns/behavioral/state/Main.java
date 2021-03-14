package com.patterns.behavioral.state;

import com.patterns.behavioral.state.context.StateContext;

public class Main {
    public static void main(String args[]){
        StateContext sc = new StateContext();
        sc.saySomething();
        sc.saySomething();
        sc.saySomething();
        sc.saySomething();
    }
}