package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class ArraysDuplicate {

    // 2. How to find duplicate number on Integer array in Java?
    //  An array contains n numbers ranging from 0 to n-2. There is exactly one number is repeated in the array.
    //  You need to write a program to find that duplicate number. For example, if an array with length 6 contains numbers {0, 3, 1, 2, 3}, then duplicated number is 3.
    //  Actually, this problem is very similar to previous one and you can apply the same trick of comparing actual sum of an array to expected sum of series to find out that duplicate.
    //  This is generally asked as follow-up question of previous problem.

    public static void main(String[] args) {

        int[] arr = new int[]{0, 3, 1, 2, 2};
        Set<Integer> set = new HashSet<>();
        int duplicate = 0;
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                duplicate = arr[i];
                break;
            } else {
                set.add(arr[i]);
            }
        }
        System.out.println("Duplicate integer:" + duplicate);

    }
}
