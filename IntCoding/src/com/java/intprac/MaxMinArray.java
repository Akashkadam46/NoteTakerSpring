package com.java.intprac;

public class MaxMinArray {
	
	public static void findMaxMin(int[] arr){
		if(arr.length == 0 ){
			System.out.println("Array is empty");
			return;
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > max){
				max = arr[i];
			}
			
			if(arr[i] < min){
				min = arr[i];
			}
		}
		
		System.out.println("Maximum Element " +max );
		System.out.println("Minimum Element " +min);
		
		
	}
	
	public static void main(String[] args) {
		int[] arr = {0,7,6,9,17,4,5};
		findMaxMin(arr);
	
	}

}
