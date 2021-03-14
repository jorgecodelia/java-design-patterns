package com.patterns.structural.facade;

import com.patterns.structural.facade.facade.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.run();
    }
}
