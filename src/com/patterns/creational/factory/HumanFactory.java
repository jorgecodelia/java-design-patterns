package com.patterns.creational.factory;

import com.patterns.creational.factory.model.Boy;
import com.patterns.creational.factory.model.Girl;
import com.patterns.creational.factory.model.Human;

public class HumanFactory {
    public static Human createHuman(String m){
        Human p = null;
        if(m.equals("boy")){
            p = new Boy();
        }else if(m.equals("girl")){
            p = new Girl();
        }

        return p;
    }
}
