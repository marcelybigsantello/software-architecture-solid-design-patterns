package com.masantello.designpatterns.behavioralpatterns.template;

public class App {

    public static void main(String[] args0) {
        int[] nums = {1, 5, 6, -9, 10, 22, 2, 3, 1000, 2000, 500, 246, -2};

        Algorithm sorting = new SelectionSort(nums);
        sorting.sort();
        var sorting2 = new BubbleSort(nums);
        sorting2.sort();
    }
}
