package com.masantello.designpatterns.behavioralpatterns.command;

import java.util.ArrayList;
import java.util.List;

// invoker - carries a reference to a Command object
public class Switcher {

    private final List<Command> commands;

    public Switcher() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
