package com.masantello.singleresponsibility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise {

    private static final int THRESHOLD = 5;

    public static void main(String[] args) {
        System.out.println("Welcome to the application!!");

        List<Integer> numbers = generateIntegerListFromUsersInput();

        sortNumbers(numbers);

        printResult(numbers);
    }

    private static List<Integer> generateIntegerListFromUsersInput() {
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Enter 05 valid integers in the range [0,10]: ");

        readIntegerNumbersFromInput(numbers);

        return numbers;
    }

    private static void readIntegerNumbersFromInput(List<Integer> nums) {
        Scanner scanner = new Scanner(System.in);

        while (nums.size() < THRESHOLD) {
            String s = scanner.nextLine();

            if (!validateIfNumberAreInValid(s))
                continue;

            nums.add(Integer.valueOf(s));
        }

        scanner.close();
    }

    private static boolean validateIfNumberAreInValid(String s) {
        int num = Integer.parseInt(s);

        if (num < 0 || num > 10) {
            System.out.println("Invalid range! Try again");
            return false;
        }
        return true;
    }

    private static void sortNumbers(List<Integer> numbers) {
        Collections.sort(numbers);
    }

    private static void printResult(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

}
