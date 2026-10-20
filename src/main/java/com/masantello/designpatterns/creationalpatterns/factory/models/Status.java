package com.masantello.designpatterns.creationalpatterns.factory.models;

public enum Status {

    SETTLED(1, "Settled"),
    EXPECTED(2, "Expected"),
    WAITING_UP(3, "Waiting_UP"),
    NOT_PROVIDED_UP(4, "Not_Provided_UP"),
    UNKNOWN(5, "Unknown");

    private final Integer code;
    private final String description;

    Status(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
