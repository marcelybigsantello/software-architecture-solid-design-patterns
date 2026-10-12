package com.masantello.interfacesegregation;

public class BinarySearchTree implements Tree {

    @Override
    public void insert() {
        System.out.println("Inserting a new item...");
    }

    @Override
    public void delete() {
        System.out.println("Deleting a new item...");
    }

    @Override
    public void traverse() {
        System.out.println("In-order traversal in O(N)...");
    }
}
