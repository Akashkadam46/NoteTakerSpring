package com.java.intprac;

import java.util.HashSet;
import java.util.Set;

public class MissingMoreNum {
    
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 5, 6, 7};
        Set<Integer> missingNumbers = findMissingNumbers(nums);
        System.out.println("Missing Numbers: " + missingNumbers);
    }

    public static Set<Integer> findMissingNumbers(int[] nums) {
        Set<Integer> missingNumbers = new HashSet<>();
        Set<Integer> numSet = new HashSet<>();
        
        int n = nums.length;
        
        // Add all elements of the array to the set
        for (int num : nums) {
            numSet.add(num);
        }
        
        // Find missing numbers
        for (int i = 0; i <= n; i++) {
            if (!numSet.contains(i)) {
                missingNumbers.add(i);
            }
        }
        
        return missingNumbers;
    }
}
