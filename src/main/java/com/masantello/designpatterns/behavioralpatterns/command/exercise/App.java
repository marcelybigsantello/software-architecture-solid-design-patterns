package com.masantello.designpatterns.behavioralpatterns.command.exercise;

public class App {

    public static void main(String[] args) {
        var taskExecutor = new TaskExecutor();

        new Thread(() -> taskExecutor.produce()).start();
        new Thread(() -> taskExecutor.consume()).start();

        //Command design pattern is so powerful because it allows to delay execution
        //We can store this commands in a data structure
        // If we are dealing with multiple threads, we need to make sure it's a synchronized data structure
        
    }
}
