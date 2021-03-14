package com.patterns.behavioral.mediator.mediator;

import com.patterns.behavioral.mediator.model.ColleagueA;
import com.patterns.behavioral.mediator.model.ColleagueB;

public interface IMediator {
    public void fight();
    public void talk();
    public void registerA(ColleagueA a);
    public void registerB(ColleagueB a);
}
