package com.patterns.creational.singleton;

public class AmericaPresident {
    //thePresident is declared as final, so it will always contain the same object reference.
    private static final AmericaPresident thePresident = new AmericaPresident();

    private AmericaPresident() {}

    public static AmericaPresident getPresident() {
        return thePresident;
    }
}