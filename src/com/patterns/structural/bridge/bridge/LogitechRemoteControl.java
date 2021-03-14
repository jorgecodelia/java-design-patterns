package com.patterns.structural.bridge.bridge;

import com.patterns.structural.bridge.model.ITV;

public class LogitechRemoteControl extends AbstractRemoteControl {

    public LogitechRemoteControl(ITV tv) {
        super(tv);
    }

    public void setChannelKeyboard(int channel){
        setChannel(channel);
        System.out.println("Logitech use keyword to set channel.");
    }
}