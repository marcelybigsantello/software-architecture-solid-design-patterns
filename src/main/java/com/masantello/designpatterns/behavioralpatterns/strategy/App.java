package com.masantello.designpatterns.behavioralpatterns.strategy;

public class App {

    public static void main(String[] args) {

        OperationManager operationManager = new OperationManager();
        operationManager.setCalculationStrategy(new Addition());
        System.out.println(operationManager.execute(12, 10));

    }
}
