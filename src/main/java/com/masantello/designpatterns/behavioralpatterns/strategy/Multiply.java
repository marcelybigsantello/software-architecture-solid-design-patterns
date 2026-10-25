package com.masantello.designpatterns.behavioralpatterns.strategy;

public class Multiply implements CalculationStrategy {

    @Override
    public Float execute(float num1, float num2) {
        return num1 * num2;
    }
}
