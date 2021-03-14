package com.patterns.behavioral.command.invoker;

import com.patterns.behavioral.command.model.Command;
import com.patterns.behavioral.command.model.Computer;

/* The Command for shutting down the computer*/
public class ShutDownCommand implements Command {
    private Computer computer;

    public ShutDownCommand(Computer computer) {
        this.computer = computer;
    }

    public void execute(){
        computer.shutDown();
    }
}
