package com.patterns.behavioral.chainOfResponsability.model;

public class ReceiverB extends Chain {
    public ReceiverB(int threshold) {
        this.Threshold = threshold;
    }

    protected void writeMessage(String msg) {
        System.out.println("Receiver B: " + msg);
    }
}
