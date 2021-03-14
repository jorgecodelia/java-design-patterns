package com.patterns.behavioral.command.model;

/* The Receiver class */
public class Computer {
    public void shutDown() {
        System.out.println("computer is shut down");
    }

    public void restart() {
        System.out.println("computer is restarted");
    }
}
