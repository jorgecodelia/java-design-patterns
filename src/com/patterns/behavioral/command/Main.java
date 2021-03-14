package com.patterns.behavioral.command;

import com.patterns.behavioral.command.invoker.RestartCommand;
import com.patterns.behavioral.command.invoker.ShutDownCommand;
import com.patterns.behavioral.command.invoker.Switch;
import com.patterns.behavioral.command.model.Command;
import com.patterns.behavioral.command.model.Computer;

/* The client */
public class Main {
    public static void main(String[] args){
        Computer computer = new Computer();
        Command shutdown = new ShutDownCommand(computer);
        Command restart = new RestartCommand(computer);

        Switch s = new Switch();

        String str = "shutdown"; //get value based on real situation

        if(str == "shutdown"){
            s.storeAndExecute(shutdown);
        }else{
            s.storeAndExecute(restart);
        }
    }
}
