package com.masantello.interfacesegregation.exercise;

public interface ICeo extends IEmployee {

    //CEO
    void makeDecisions(String ceoName);
    void addStocks(String ceoName);
    void addBonus();
}
