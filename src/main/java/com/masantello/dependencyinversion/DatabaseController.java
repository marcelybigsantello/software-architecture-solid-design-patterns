package com.masantello.dependencyinversion;

//The high level module
public class DatabaseController {

    //we program to an interface - so we can achieve loosely coupled architecture
    private final Database database;

    public DatabaseController(Database database) {
        //Tight binding when we program to a class (instead of an interface)
        this.database = database;
    }

    public void connect() {
        this.database.connect("jdbc:test");
    }

    public void disconnect() {
        this.database.disconnect();
    }


}
