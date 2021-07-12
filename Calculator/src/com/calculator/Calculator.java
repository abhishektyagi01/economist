package com.calculator;

public class Calculator {

	public Calculator() {
		
	}
	
	public static int sum (int a, int b){
		
		return (a+b);
	}
	
	public static int subtract (int a, int b) {
		
		return (a-b);
	}
	
	public static long multiply (int a, int b) {
		
		return (a*b);
	}
	
	public static double divide (int a, int b) {
		
		double result;
		if (b==0) {
			
			throw new IllegalArgumentException("Cannot divide by zero");
		}
		else {
			result = Double.valueOf(a)/Double.valueOf(b);
		}
		return result;
	}
}
