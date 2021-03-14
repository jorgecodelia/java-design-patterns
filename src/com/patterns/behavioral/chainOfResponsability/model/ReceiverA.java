package com.patterns.behavioral.chainOfResponsability.model;

public class ReceiverA extends Chain {
    public ReceiverA(int threshold) {
        this.Threshold = threshold;
    }

    protected void writeMessage(String msg) {
        System.out.println("Receiver A: " + msg);
    }
}
