package com.masantello.dependencyinversion;

//The low level module
public class MySqlDatabase implements Database {

    @Override
    public void connect(String jdbcUrl) {
        System.out.println("Connecting to a MySQL Database: " + jdbcUrl);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from a MySQL Database. ");
    }
}
