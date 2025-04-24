package com.arrays;

public class ArraysCustom {

    //4. How to find largest and smallest number in unsorted array?

    public static int getSmallestIntegerFromArray(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        return smallest;
    }

    public static int getLargestIntegerFromArray(int[] arr) {
        int largest = 0;
        return largest;
    }

    public int[] getSmallestAndLargestIntegerFromArray(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++) {
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        return new int[] {smallest, largest} ;
    }

    public class Result {

        private final int smallest;
        private final int largest;

        Result(int smallest, int largest) {
            this.smallest = smallest;
            this.largest = largest;
        }

        public int getSmallest() {
            return smallest;
        }

        public int getLargest() {
            return largest;
        }
    }

}
