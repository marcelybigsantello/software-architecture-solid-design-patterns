package com.masantello.openclosed;

import java.util.List;

public class MergeSort implements SortingAlgorithms {

    @Override
    public void sortItems() {
        System.out.println("Sort using the " + getClass().getSimpleName() + " algorithm.");
    }

    @Override
    public void printResult(List<Integer> numbers) {
        for (Integer n : numbers) {
            System.out.print(n + " ");
        }
    }
}
