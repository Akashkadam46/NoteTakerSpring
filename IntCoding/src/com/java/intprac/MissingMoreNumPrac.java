package com.java.intprac;

import java.util.HashSet;
import java.util.Set;



public class MissingMoreNumPrac {
	
	
	public static void main(String[] args) {
		
		int[] nums = {2,3,4,5,6,9,10};
		Set<Integer> missingNumber = findMissingNumber(nums);
		System.out.println("Missing Number : "+missingNumber);
		
	}
	
	public static Set<Integer> findMissingNumber(int[] nums){
		
		Set<Integer> missingNumbers = new HashSet<>();
		Set<Integer> newSet = new HashSet<>();
		
		int n = nums.length;
		
		for (int num : nums) {
			newSet.add(num);
		}
		
		for (int i = 0; i < n; i++) {
			if (!newSet.contains(i)) {
				missingNumbers.add(i);
			}
		}
		
		return missingNumbers;
	}
	
	

}
