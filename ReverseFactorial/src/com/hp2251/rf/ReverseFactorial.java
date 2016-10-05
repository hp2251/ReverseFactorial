package com.hp2251.rf;

import java.io.PrintStream;

public class ReverseFactorial {
	private static final PrintStream OUT = System.out;

	public static void main(String[] args) {
		OUT.println(ReverseFactorial.ReverseF(120));
		OUT.println(ReverseFactorial.ReverseF(121));
		OUT.println(ReverseFactorial.ReverseF(3628800));
		
		OUT.println(ReverseFactorial.Factorial(5));
		OUT.println(ReverseFactorial.Factorial(10));
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
	
	public static int Factorial(int n) {
		if(n <= 1) return 1;
		else return n * Factorial(n-1);
	}

}
