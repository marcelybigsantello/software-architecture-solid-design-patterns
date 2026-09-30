package com.masantello.liskovsubstitution;

public class Car extends Vehicle {

    public Car(String brand, String type, int age, float engine) {
        super(brand, type, age, engine);
    }

    @Override
    protected void speedUp() {
        System.out.println("Car " + brand + " is speeding up...");
    }

    @Override
    protected void slowDown() {
        System.out.println("Car " + brand + " is slowing down...");
    }

    @Override
    public void fuel() {
        System.out.println("Car " + brand + " is being fueled.");
    }
}
