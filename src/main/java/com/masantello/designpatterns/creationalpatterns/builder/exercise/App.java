package com.masantello.designpatterns.creationalpatterns.builder.exercise;

public class App {

    public static void main(String[] args) {
        Student student = new Student.Builder(1, "Guilherme Martinelli", "MIT")
                .setAge(30)
                .build();

        System.out.println(student);
    }
}
