package com.java.intprac;



public class Test {
	  
	 public static void main(String[] args) {
	     int[] nums = {0,1,2,4,5};
	     int missingNumber = findMissingNumber(nums);
	     System.out.println("Missing Number :  " +missingNumber);
		
	}
	 
	 public static int findMissingNumber(int[] nums){
		 int n = nums.length;
		 int totalSum = n * (n+1)/2;
		 int arraySum = 0;
		 
		 for (int num : nums) {
			arraySum += num;
			
		}
		 
		 return totalSum-arraySum;
	 }

}
