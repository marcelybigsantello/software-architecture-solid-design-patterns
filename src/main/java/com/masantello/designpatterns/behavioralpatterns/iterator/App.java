package com.masantello.designpatterns.behavioralpatterns.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class App {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator2 it = nameRepository.getIterator(); it.hasNext();) {
            String name = (String) it.next();
            System.out.println(name);
        }

        System.out.println("=======================================================================================");
        //how it works in Java
        List<String> maleNames = Arrays.asList("Adam", "Jhon", "Guilherme", "Kaue");

        Stack<String> stack = new Stack<>(); //LIFO - Last In First Out
        stack.push("10");
        stack.push("20");
        stack.push("30");

        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
