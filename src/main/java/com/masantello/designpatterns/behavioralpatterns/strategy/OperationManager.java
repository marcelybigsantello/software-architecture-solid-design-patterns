package com.masantello.designpatterns.behavioralpatterns.strategy;

import java.nio.charset.MalformedInputException;

// Abstract layer in between the high level modules and the low level modules
public class OperationManager {

    // we have to use the Composition
    // Because the behavior may be changed at run-time
    private CalculationStrategy calculationStrategy;

    public void setCalculationStrategy(CalculationStrategy calculationStrategy) {
        this.calculationStrategy = calculationStrategy;
    }

    public Float execute(float num1, float num2) {
        return this.calculationStrategy.execute(num1, num2);
    }

}
