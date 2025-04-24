package com.learning;

import java.util.*;

public class StringDemo {

    public static void main(String[] args) {
        String name = "pradeep Kumar Kotari";

        // first known repeating character - P is also repeating , e is also repeating
        char[] arr = name.toCharArray();
        Set<Character> chars = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (chars.contains(c)) {
                    System.out.println(c); // duplicate character should be printed here...
                    break;
                } else {
                    //
                    chars.add(c);
                }
            }
            break;
        }
    }
}
