package com.java.methodref;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceDemo {
	
	public static int addition(int a, int b){
		return (a+b);
	}
	
	public static void main(String[] args) {
		
		
		//1.method reference to a static method
		
		//lambda expression
		Function<Integer, Double> function = (input)  -> Math.sqrt(input);
		System.out.println(function.apply(4));
		
		//using method reference
		Function<Integer, Double> functionMethodRef = Math::sqrt;
		System.out.println(functionMethodRef.apply(9));
		
		//lambda expression
		BiFunction<Integer, Integer, Integer> biFunctionLambda = (a,b) -> MethodReferenceDemo.addition(a, b);
		System.out.println(biFunctionLambda.apply(29, 45));
		
		//using method reference
		BiFunction<Integer, Integer, Integer> biFunction =  MethodReferenceDemo::addition;
		System.out.println(biFunction.apply(30, 70));
		
		
	}

}
