package com.kotari;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TwoDimArray {


    public static void main(String[] args) {
        int [] ints = new int [10];

        int [][] values = new int [5] [2];

        // 1, 100
        // 2, 50
        // 5, 15
        // 40, 60

        ints [0] = 1;
        ints [1] = 100;

        values [0] = ints;


        // 5, 15
        // 2, 50
        // 40, 60
        // 1, 100

        List<Integer> values1 = Arrays.stream(ints).boxed().collect(Collectors.toList());
        Collections.sort(values1);




    }
}
