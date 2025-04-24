package com.ocp;

public class InPlaceSorting {

    public static void main(String[] args) {

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



        //
        // 1,0,0,0,0,0,3,0,0,

        // 7 elements
            //zeroCounter = 6
        // index of second non zero - 6 - j
        // 1, 6

        // 1,2,0,0
        int zeroCounter = 0;

        //
        for(int i=0;i<arr.length;i++) {

            int first = arr[i];
            int firstNonZero = 0;
            int secondNonZero = 0;

            boolean zeroExists = false;


            if (first==0) {
                zeroCounter++;
            } else {
                firstNonZero = first;
            }

            for (int j = i+1; j<arr.length-1;j++ ) {

                int next = arr[j];
                    if(next==0) {
                        zeroCounter++;
                    } else {
                        secondNonZero = next;
                    }
            }

            arr[i] = firstNonZero;
            arr[i+1] = secondNonZero;


            /*
            for (int k=0, K<zeroCounter;k++){
                arr[k] = 0;
            }

            */
            //
            if (zeroCounter==arr.length) {
                //
            }



            // no zeroes, one zero, one nonZero, both zeroes

            System.out.println(arr[i]);
        }
    }
}
