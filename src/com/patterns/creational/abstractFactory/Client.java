package com.patterns.creational.abstractFactory;

import com.patterns.creational.abstractFactory.factory.AMDFactory;
import com.patterns.creational.abstractFactory.factory.CPUFactory;
import com.patterns.creational.abstractFactory.factory.Computer;
import com.patterns.creational.abstractFactory.factory.IntelFactory;

public class Client {
    public static void main(String[] args) {
        new Computer(createSpecificFactory());
    }

    public static CPUFactory createSpecificFactory() {
        int sys = 0; // based on specific requirement
        if (sys == 0)
            return new AMDFactory();
        else
            return new IntelFactory();
    }
}
