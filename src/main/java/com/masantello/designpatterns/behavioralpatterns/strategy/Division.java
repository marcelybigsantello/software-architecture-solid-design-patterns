package com.masantello.designpatterns.behavioralpatterns.strategy;

public class Division implements CalculationStrategy {

    @Override
    public Float execute(float num1, float num2) {
        if (num2 == 0) {
            throw new NumberFormatException("Não é permitido dividir por 0");
        }

        return num1 / num2;
    }
}
