package com.masantello.interfacesegregation.exercise;

public class Worker implements IEmployee {

    private float salary;

    @Override
    public void deliverValue() {
        System.out.println("Worker working on features, reports and delivering value to the business context..");
    }

    @Override
    public void salary(float salary) {
        System.out.println("Worker earns salary: " + String.format("%.2f", salary));
    }

}
