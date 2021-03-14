package com.patterns.creational.abstractFactory.factory;

import com.patterns.creational.abstractFactory.model.AMDCPU;
import com.patterns.creational.abstractFactory.model.CPU;

public class AMDFactory implements CPUFactory{
    @Override
    public CPU produceCPU() {
        return new AMDCPU();
    }
}
