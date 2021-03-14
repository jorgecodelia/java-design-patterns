package com.patterns.behavioral.mediator.model;

import com.patterns.behavioral.mediator.mediator.IMediator;

public class ColleagueA extends Colleague {

    public ColleagueA(IMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void doSomething() {
        this.mediator.talk();
        this.mediator.registerA(this);
    }
}
