package com.masantello.liskovsubstitution;

public class ElectricCar extends Vehicle {

    public ElectricCar(String brand, String type, int age, float engine) {
        super(brand, type, age, engine);
    }

    @Override
    protected void speedUp() {
        System.out.println("Electric car is speeding up...");
    }

    @Override
    protected void slowDown() {
        System.out.println("Electric car is slowing down...");
    }

    @Override
    public void fuel() {
        System.out.println("Electric car is being charge...");
    }
}
