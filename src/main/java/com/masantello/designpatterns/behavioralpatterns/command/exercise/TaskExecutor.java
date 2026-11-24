package com.masantello.designpatterns.behavioralpatterns.command.exercise;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TaskExecutor {

    //FIFO
    private final BlockingQueue<Command> commands;

    public TaskExecutor() {
        this.commands = new ArrayBlockingQueue<>(10);
    }

    public void produce() {
        for (int i = 0; i < 10; i++) {
            this.commands.add(new Task(i+1));
        }
    }

    public void consume() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                this.commands.take().execute();
            }
        } catch (InterruptedException e) {
            System.out.println("Erro: " + e);
        }

    }
}
