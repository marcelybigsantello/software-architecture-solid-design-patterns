package com.masantello.interfacesegregation;

public class BalancedTree implements RotationTree {

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

    @Override
    public void rightRotation() {
        System.out.println("Right rotation");
    }

    @Override
    public void leftRotation() {
        System.out.println("Left rotation");
    }
}
