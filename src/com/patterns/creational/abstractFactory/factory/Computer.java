package com.patterns.creational.abstractFactory.factory;

import com.patterns.creational.abstractFactory.model.CPU;
import com.patterns.creational.abstractFactory.factory.CPUFactory;

public class Computer {
    CPU cpu;

    public Computer(CPUFactory factory) {
        cpu = factory.produceCPU();
        cpu.process();
    }
}
