package com.patterns.behavioral.command.invoker;

import com.patterns.behavioral.command.model.Command;
import com.patterns.behavioral.command.model.Computer;

/* The Command for restarting the computer */
public class RestartCommand  implements Command {
    private Computer computer;

    public RestartCommand(Computer computer) {
        this.computer = computer;
    }

    public void execute() {
        computer.restart();
    }
}
