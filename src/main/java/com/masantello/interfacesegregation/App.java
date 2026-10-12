package com.masantello.interfacesegregation;

public class App {

    public static void main(String[] args) {
        Tree tree = new BinarySearchTree();

        tree.insert();
        tree.traverse();
        tree.delete();

        RotationTree balancedTree = new BalancedTree();
        balancedTree.insert();
        balancedTree.traverse();
        balancedTree.delete();
        balancedTree.rightRotation();
        balancedTree.leftRotation();
    }
}
