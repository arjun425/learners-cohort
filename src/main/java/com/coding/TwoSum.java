package com.coding;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] intArr, int target) {
        // Create a HashMap to store the number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Loop through the array
        for (int i = 0; i < intArr.length; i++) {
            // Calculate the complement of the current number
            int complement = target - intArr[i];

            // If the complement exists in the map, return the pair of indices
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            // Otherwise, add the current number and its index to the map
            map.put(intArr[i], i);
        }

        // Return an empty array if no solution is found (though problem guarantees one solution)
        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] intArr = {2, 7, 11, 15, -1, 10};
        int target = 9;

        int[] result = solution.twoSum(intArr, target);

        // Output the result
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
