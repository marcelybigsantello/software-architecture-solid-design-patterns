package com.masantello.interfacesegregation.exercise;

public interface IManager extends IEmployee {

    // Manager
    void hire(String managerName);
    void train(String managerName, String courseTitle);
    void addBonus();
}
