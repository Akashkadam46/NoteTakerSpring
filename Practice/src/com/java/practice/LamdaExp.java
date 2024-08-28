package com.java.practice;

import java.util.ArrayList;
import java.util.List;

public class LamdaExp {
	
	public static void main(String[] args) {
		List<String> lists = new ArrayList<String>();
		
		
		lists.add("Akash");
		lists.add("Vasant");
		lists.add("Kadam");
		
		lists.forEach((temp) -> {System.out.println(temp); });
			
		
	}

}
