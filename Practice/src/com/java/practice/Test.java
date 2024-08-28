package com.java.practice;

import java.util.Arrays;

public class Test {
	 
	public static void main(String[] args) {
		
		String arr[] = {"3","30","34","5","9"};
		System.out.println(largestNumber(arr));
	}
	
	public static String largestNumber(String arr[]){
		// Print the initial array
		System.out.println("Initial Array:");
		System.out.println(Arrays.toString(arr));
		
		// Sort the array with custom comparator
		Arrays.sort(arr, (num1,num2)->{
			String concat1 = num2 + num1;
			String concat2 = num1 + num2;
			int result = concat1.compareTo(concat2);
			System.out.println("Comparing " + num1 + " and " + num2 + ":");
			System.out.println(concat1 + " compared to " + concat2 + " => " + result);
			return result;
		});
		
		// Print the sorted array
		System.out.println("\nSorted Array:");
		System.out.println(Arrays.toString(arr));
		
		// Build the result string
		String str ="";
	    for (String s : arr) {
			str = str+s;	
		}
	    
	    return str;
	}
}

