package com.ocp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        /*
        Input: nums = [0,1,0,3,12]
        Output: [1,3,12,0,0]

        0, 0, 1, 3

        0,0
        1,3,0,0,

         */

        // in place

        // don't List

        // create another array
        // copy array


        //do List
        //maintain order

        // indexes 0, 1

        // size of the array
        // integers


        int[] arr = new int[10];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 0;
        arr[3] = 3;
        arr[4] = 12;
        // count of zeros
        // 0,0,0,0,34

        // 0,0,0,0,34,6,0

        //non zero - 0 index
       // 1,2,6,7,8,0,0,0,0


        // 0,0,1,2,0,0,6,7,8

        // 1,2,0,0
        int zeroCounter = 0;

        //
        for(int i=0;i<arr.length;i++) {

            int first = arr[i];
            int firstNonZero = 0;
            int secondNonZero = 0;
            boolean zeroExists = false;
            boolean firstNonZeroFound = false;

            if (first==0) {
                zeroCounter++;
            } else {
                firstNonZero = first;
                firstNonZeroFound = true;
            }

            for (int j = i+1; j<arr.length-1;j++ ) {

                int next = arr[j];
                while(!firstNonZeroFound){
                    if(next==0) {
                        zeroCounter++;
                    } else {
                        secondNonZero = next;
                        firstNonZeroFound = true;
                    }
                }

            }

            arr[i+1] = secondNonZero;

            //
            if (zeroCounter==arr.length) {
                //
            }



            // no zeroes, one zero, one nonZero, both zeroes

            System.out.println(arr[i]);
        }


    }

}
