package com.masantello.dependencyinversion;

public interface Database {

    void connect(String jdbcUrl);
    void disconnect();

}
