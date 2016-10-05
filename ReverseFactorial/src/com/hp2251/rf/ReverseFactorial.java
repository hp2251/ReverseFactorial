package com.hp2251.rf;

import java.io.PrintStream;

public class ReverseFactorial {
	private static final PrintStream OUT = System.out;

	public static void main(String[] args) {
		System.out.println(ReverseFactorial.ReverseF(120));
		System.out.println(ReverseFactorial.ReverseF(121));
	}

	public static String ReverseF(int n) {
		int result = n;
		int divisor = 2;
		
		while(result % divisor == 0) {
			result = result / divisor++;
		}
		
		StringBuilder answer = new StringBuilder(n + "");
		answer.append(" = ");
		
		if(result == 1) answer.append((divisor-1)).append("!");
		else answer.append("NONE");
		
		return answer.toString();
	}
	
	public static String Factorial(int n) {
		return "";
	}

}
