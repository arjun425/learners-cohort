package com.ocp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Sample {

    public static void main(String[] args) {


        String input = "hellowwww###orrrrrrr######ld";

        char[] chars = input.toCharArray();
        LinkedList<Character> characterList = new LinkedList<>();
        Stack<Character> characters = new Stack<>();
        int indexCount = 0;
        int itemsRemoved = 1;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if (c == '#') {
                characters.pop();
            } else {
                characters.add(c);
            }
        }

        System.out.println(characters);


    }
}
