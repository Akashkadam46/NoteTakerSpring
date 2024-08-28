package com.java.intprac;

import java.util.HashSet;
import java.util.Set;

public class MissingTwoPlusNum {
    
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6, 9, 10};
        Set<Integer> missingNumbers = findMissingNumbers(nums);
        System.out.println("Missing Numbers: " + missingNumbers);
    }
    
    public static Set<Integer> findMissingNumbers(int[] nums) {
        Set<Integer> missingNumbers = new HashSet<>();
        Set<Integer> numSet = new HashSet<>();
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        // Add all elements to the set and determine the min and max
        for (int num : nums) {
            numSet.add(num);
            
            
            System.out.println(max);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        
        // Find missing numbers in the range from min to max
        for (int i = min; i <= max; i++) {
            if (!numSet.contains(i)) {
                missingNumbers.add(i);
            }
        }
        
        return missingNumbers;
    }
}
