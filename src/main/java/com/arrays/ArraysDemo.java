package com.arrays;

import java.util.*;

public class ArraysDemo {

    // How to find the missing number in integer array of 1 to 100?

    //This is one of the most simple array problems you will see, mostly asked in a telephonic round of Interview.
    // You have given an integer array which contains numbers from 1 to 100 but one number is missing, you need to write a Java program to find that missing number in an array.
    // You cannot use any open source library or Java API method which solves this problem


    private static int[] getArrayOfNinetyNineNumbers(int numberToSkip) {
        int[] numbers = new int[99];
        for (int i = 0; i < numbers.length + 1; i++) {
            if (i + 1 < numberToSkip) {
                numbers[i] = i + 1;
            } else if (i + 1 > numberToSkip) {
                numbers[i - 1] = i + 1;
            }
        }
        return numbers;
    }

    private static Set<Integer> getRandomNumbersWithNMissing(int origin, int bound, int n) {
        Set<Integer> setOfNIntegers = new LinkedHashSet<>();
        while (setOfNIntegers.size() < bound - origin - n) {
            Random random = new Random();
            int randomInt = random.nextInt(origin,bound);
            setOfNIntegers.add(randomInt);
        }
        return setOfNIntegers;
    }

    private static int getMissingNumber(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if (numbers[i] != i + 1) {
                System.out.println("Missing Number is:" + (i + 1));
                return (i + 1);
            }
        }
        return -1;
    }

    private static Set<Integer> getMissingNumbers(Set<Integer> oneToHundred) {
        Set<Integer> seqNumbers = new HashSet<>();
        for (int i = 1; i <= 100; i++) {
            seqNumbers.add(i);
        }
        for (int i : oneToHundred) {
            seqNumbers.remove(i);
        }

        return seqNumbers;
    }

    public static void main(String[] args) {
        int numberToSkip = 10;
        int[] numbers = getArrayOfNinetyNineNumbers(numberToSkip);
        getMissingNumber(numbers);
        Set<Integer> oneToHundred = getRandomNumbersWithNMissing(1,101,2);
        System.out.println(oneToHundred.toString());
        System.out.println("Missing Number is:" + getMissingNumbers(oneToHundred).stream().findFirst().get());
        System.out.println("oneToHundred array contains 1:" + oneToHundred.contains(1));
        System.out.println("numbers array contains " + numberToSkip + " :" + Arrays.asList(numbers).contains(numberToSkip));
        System.out.println(Arrays.toString(new ArraysCustom().getSmallestAndLargestIntegerFromArray(numbers)));

        Set<Integer> set = getRandomNumbersWithNMissing(10,65,2);
        int[] oneToHundredArr = new int[set.size()];
        int i = 0;
        for (int number : set) {
            oneToHundredArr[i] = number;
            i++;
        }
        System.out.println(Arrays.toString(new ArraysCustom().getSmallestAndLargestIntegerFromArray(oneToHundredArr)));
    }

}
