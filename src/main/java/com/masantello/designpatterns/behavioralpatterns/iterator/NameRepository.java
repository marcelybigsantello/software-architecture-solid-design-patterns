package com.masantello.designpatterns.behavioralpatterns.iterator;

public class NameRepository {

    private String[] names = {"Adam", "Jonas", "Matheus", "Guilherme", "Pedro", "Henrique"};

    public Iterator2 getIterator() {
        return new NameIterator(names);
    }
}
