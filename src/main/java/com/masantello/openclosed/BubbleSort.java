package com.masantello.openclosed;

import java.util.List;

public class BubbleSort implements SortingAlgorithms {

    @Override
    public void sortItems() {
        System.out.println("Sort using the " + getClass().getSimpleName() + " algorithm.");
    }

    @Override
    public void printResult(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
