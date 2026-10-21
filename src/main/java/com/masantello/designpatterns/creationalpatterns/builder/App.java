package com.masantello.designpatterns.creationalpatterns.builder;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        // Builder: one of the most important and more used design pattern
        Person p = new Person.Builder(1, "Maria", "maria.clara@gmail.com")
                .setDocumentId("123456789")
                .setAddress("Rua Teste, 123")
                .setBirthDate(LocalDate.of(1976, 10, 20))
                .build();

        System.out.println(p);

    }
}
