package com.masantello.designpatterns.creationalpatterns.singleton;

public class DatabaseConnector {

    //eager version
    private static DatabaseConnector INSTANCE = new DatabaseConnector();

    //we are not able to instantiate the class
    public DatabaseConnector() {

    }

    public static DatabaseConnector getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DatabaseConnector();
        }
        return INSTANCE;
    }

    public void connect(String jdbcUrl) {
        System.out.println("Connecting to the database: " + jdbcUrl);
    }

}
