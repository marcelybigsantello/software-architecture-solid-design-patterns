package com.masantello.liskovsubstitution;

public class App {

    public static void main(String[] args) {

        Vehicle v = new ElectricCar("Tesla", "Standard", 510, 2.0f);

        v.speedUp();
        v.slowDown();
        v.fuel();
    }
}
