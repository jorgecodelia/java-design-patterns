package com.patterns.behavioral.strategy.strategy;

import com.patterns.behavioral.strategy.model.Strategy;

public class Situation {
    private Strategy strategy;

    public Situation(Strategy strategy){
        this.strategy = strategy;
    }

    public void handleByPolice(int speed){
        this.strategy.processSpeeding(speed);
    }
}
