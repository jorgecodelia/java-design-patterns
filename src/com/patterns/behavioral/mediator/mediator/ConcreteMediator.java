package com.patterns.behavioral.mediator.mediator;

import com.patterns.behavioral.mediator.model.ColleagueA;
import com.patterns.behavioral.mediator.model.ColleagueB;

public class ConcreteMediator implements IMediator{

    ColleagueA talk;
    ColleagueB fight;

    public void registerA(ColleagueA a){
        talk = a;
    }

    public void registerB(ColleagueB b){
        fight = b;
    }

    public void fight(){
        System.out.println("Mediator is fighting");
        //let the fight colleague do some stuff
    }

    public void talk(){
        System.out.println("Mediator is talking");
        //let the talk colleague do some stuff
    }
}
