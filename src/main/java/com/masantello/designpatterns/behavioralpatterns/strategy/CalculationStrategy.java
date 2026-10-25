package com.masantello.designpatterns.behavioralpatterns.strategy;

import java.nio.charset.MalformedInputException;

//abstraction
public interface CalculationStrategy {

    Float execute(float num1, float num2);

}
