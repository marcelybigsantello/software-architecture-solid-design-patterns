package com.masantello.dependencyinversion;

public class OracleDatabase implements Database {

    @Override
    public void connect(String jdbcUrl) {
        System.out.println("Connecting to a Oracle Database: " + jdbcUrl);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from an Oracle Database. ");
    }
}
