package com.kotari;

import java.util.ArrayList;
import java.util.Scanner;

public class SortingProgram {

    public static int lengthOfLongestSubstring(String str)
    {
        int n = str.length();
        int res = 0;

        for(int i = 0; i < n; i++)
        {

            boolean[] visited = new boolean[256];

            for(int j = i; j < n; j++)
            {
                if (visited[str.charAt(j)] == true)
                    break;

                else
                {
                    res = Math.max(res, j - i + 1);
                    visited[str.charAt(j)] = true;
                }
            }
            visited[str.charAt(i)] = false;
        }
        return res;
    }

    public static void main(String args[]) {
        // Your code goes here
        String s = "Hello";
        SortingProgram ob = new SortingProgram();
        System.out.println(ob.lengthOfLongestSubstring(s));
    }


    /*
        Kaprekar discovered the Kaprekar constant known as 6174.

        He showed that 6174 is reached in the limit as one repeatedly
        subtracts the highest and lowest numbers that can be constructed from a set of four digits that are not all identical.



        for example, for number 1234 we have



        Iteration-1 : 4321 - 1234 = 3087
        Iteration-2 : 8730 - 0378 = 8352
        Iteration-3 : 8532 - 2358 = 6174.



        So, process completes in 3 iteration.



        The number 6174 is reached in N iteration where N is different for different 4 digits numbers.



        Except for numbers like 1111, 2222, 3333 etc., it should return 0



        Write a program which takes a four-digit number as an argument and find out in how many iterations 6174 is reached for input number.
         */
    private static void calculateIterations (int input) {

    }


}
