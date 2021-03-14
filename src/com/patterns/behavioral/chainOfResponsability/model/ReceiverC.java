package com.patterns.behavioral.chainOfResponsability.model;

public class ReceiverC extends Chain {
    public ReceiverC(int threshold) {
        this.Threshold = threshold;
    }

    protected void writeMessage(String msg) {
        System.out.println("Receiver C: " + msg);
    }
}