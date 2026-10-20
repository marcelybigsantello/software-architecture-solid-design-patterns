package com.masantello.designpatterns.creationalpatterns.singleton;

import com.masantello.dependencyinversion.Database;

public class App {

    public static void main(String[] args) {
        DatabaseConnector.getInstance().connect("jdbc:test");

        DatabaseConnector d1 = DatabaseConnector.getInstance();
        DatabaseConnector d2 = DatabaseConnector.getInstance();

        if (d1 == d2) {
            System.out.println("The objects are the same: " + d1 + " and " + d2);
        }
    }
}
