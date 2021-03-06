package com.patterns.structural.bridge;

import com.patterns.structural.bridge.bridge.LogitechRemoteControl;
import com.patterns.structural.bridge.model.ITV;
import com.patterns.structural.bridge.model.SonyTV;

public class Main {
    public static void main(String[] args){
        ITV tv = new SonyTV();
        LogitechRemoteControl lrc = new LogitechRemoteControl(tv);
        lrc.setChannelKeyboard(100);
    }
}
