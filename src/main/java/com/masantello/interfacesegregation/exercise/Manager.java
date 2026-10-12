package com.masantello.interfacesegregation.exercise;

public class Manager implements IManager, ILeadership {

    private String managerName;

    @Override
    public void hire(String managerName) {
        System.out.println("Manager " + managerName + " is hiring people to the Software Engineering department.");
    }

    @Override
    public void train(String managerName, String courseTitle) {
        System.out.println("Manager " + managerName + " is conducting the " +courseTitle+ " course.");
    }

    @Override
    public void deliverValue() {
        System.out.println("Manager delivers value to the business context.");
    }

    @Override
    public void salary(float salary) {
        System.out.println("Manager earns salary: " + String.format("%.2f", salary));
    }

    @Override
    public void addBonus() {
        System.out.println("Manager added bonus to his/her people");
    }

}
