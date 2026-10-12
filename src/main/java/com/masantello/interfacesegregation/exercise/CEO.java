package com.masantello.interfacesegregation.exercise;

public class CEO implements ICeo, ILeadership {

    private String ceoName;

    @Override
    public void makeDecisions(String ceoName) {
        System.out.println("CEO " + ceoName + " is making strategic decisions to the company.");
    }

    @Override
    public void addStocks(String ceoName) {
        System.out.println("CEO " + ceoName + " is adding stocks.");
    }

    @Override
    public void deliverValue() {
        System.out.println("CEO delivers value to the whole company.");
    }

    @Override
    public void salary(float salary) {
        System.out.println("CEO Earns salary: " + String.format("%.2f", salary));
    }

    @Override
    public void addBonus() {
        System.out.println("CEO added bonus to the directors and to the managers");
    }
}
