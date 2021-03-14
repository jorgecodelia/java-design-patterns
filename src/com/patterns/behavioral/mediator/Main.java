package com.patterns.behavioral.mediator;

import com.patterns.behavioral.mediator.mediator.ConcreteMediator;
import com.patterns.behavioral.mediator.model.ColleagueA;
import com.patterns.behavioral.mediator.model.ColleagueB;
import com.patterns.behavioral.mediator.mediator.IMediator;

public class Main {
    public static void main(String[] args) {
        IMediator mediator = new ConcreteMediator();

        ColleagueA talkColleague = new ColleagueA(mediator);
        ColleagueB fightColleague = new ColleagueB(mediator);

        talkColleague.doSomething();
        fightColleague.doSomething();
    }
}
