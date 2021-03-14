package com.patterns.behavioral.mediator.model;

import com.patterns.behavioral.mediator.mediator.IMediator;

public abstract class Colleague {
    IMediator mediator;
    public abstract void doSomething();
}
