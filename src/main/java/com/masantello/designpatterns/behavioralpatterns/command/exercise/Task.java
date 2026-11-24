package com.masantello.designpatterns.behavioralpatterns.command.exercise;

public class Task implements Command {

    private final int id;

    public Task(int id) {
        this.id = id;
    }

    @Override
    public void execute() {
        System.out.println("Task with ID: " + this.id + " is being executed.");
    }
}
