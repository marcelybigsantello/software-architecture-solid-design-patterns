package com.masantello.designpatterns.behavioralpatterns.strategy;

public class Subtraction implements CalculationStrategy {

    @Override
    public Float execute(float num1, float num2) {
        return num1 - num2;
    }
}
