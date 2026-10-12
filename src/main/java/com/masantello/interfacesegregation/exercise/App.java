package com.masantello.interfacesegregation.exercise;

public class App {

    public static void main(String[] args) {
        IEmployee worker = new Worker();

        worker.deliverValue();
        worker.salary(3000);

        IManager manager = new Manager();
        manager.hire("Ashley");
        manager.train("Ashley", "Design Patters with Java");
        manager.deliverValue();
        manager.addBonus();
        manager.salary(10000);

        ICeo ceo = new CEO();
        ceo.makeDecisions("Steven Schmidt");
        ceo.addStocks("Steven Schmidt");
        ceo.deliverValue();
        ceo.salary(30000);
    }
}
