package com.java.intprac;

public class MissingNumber {
	
	public static int findMissingNumber(int[] arr){
		int n = arr.length;
		int sum = n*(n+1)/2;
		
		for (int num : arr) {
			sum -= num;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int[] arr = {0,1,2,4,5};
		
		System.out.println("Missing Number: " + findMissingNumber(arr));
	}

}
