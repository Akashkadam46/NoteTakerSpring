package com.java.intprac;

public class Practiceque {
	
	public static void main(String[] args) {
		
		int[] nums = {0,1,2,4,5,6,7};
		int missingNumber = findMissingNumber(nums);
		System.out.println("Missing Numbers : "+ missingNumber);
		
	}
	
	public static int findMissingNumber(int[] nums){
		int n = nums.length;
		int totalSum = n * (n+1)/2;
		int arraysum = 0;
		
		for (int num : nums) {
			arraysum += num;
		}
		
		return totalSum-arraysum;
	}
	
	
	

}
