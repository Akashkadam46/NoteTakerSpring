package com.java.lambda.Functional;

import java.util.function.Function;

class FunctionImpl implements Function<String, Integer>{

	@Override
	public Integer apply(String t) {
		// TODO Auto-generated method stub
		return t.length();
	}
	
}

public class FunctionDemo {
	
	public static void main(String[] args) {
//		Function<String, Integer> function = new FunctionImpl();
//		System.out.println(function.apply("Akash"));
		
		Function<String, Integer> function  = (String s) -> s.length();
		System.out.println(function.apply("Akash"));
	}
	
	

}
