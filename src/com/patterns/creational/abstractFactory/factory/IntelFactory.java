package com.patterns.creational.abstractFactory.factory;

import com.patterns.creational.abstractFactory.model.CPU;
import com.patterns.creational.abstractFactory.model.IntelCPU;

public class IntelFactory implements CPUFactory{
    @Override
    public CPU produceCPU() {
        return new IntelCPU();
    }
}
