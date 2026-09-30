package com.masantello.liskovsubstitution;

public abstract class Vehicle implements Fuel {

    protected String brand;
    protected String name;
    protected int fuelTankCapacity;
    protected float engine;

    public Vehicle(String brand, String name, int fuelTankCapacity, float engine) {
        this.brand = brand;
        this.name = name;
        this.fuelTankCapacity = fuelTankCapacity;
        this.engine = engine;
    }

    protected void speedUp() {
        System.out.println("Vehicle is speeding up...");
    }

    protected void slowDown() {
        System.out.println("Vehicle is slowing down...");
    }

}
