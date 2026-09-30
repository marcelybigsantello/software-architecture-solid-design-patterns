package com.masantello.openclosed;

import java.util.List;

public class SorterProcessor {

    public static void main(String[] args) {
        process(new MergeSort());
    }

    public static void process(SortingAlgorithms sortingAlgorithms) {
        sortingAlgorithms.sortItems();
        sortingAlgorithms.printResult(List.of(40, 2, 50, 6, 8, 10, 100, 80, 8, 777));
    }
}
