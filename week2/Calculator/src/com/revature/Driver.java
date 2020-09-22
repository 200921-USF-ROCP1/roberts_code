package com.revature;

import java.util.*;

public class Driver {
	/*
	 * Using your Calculator implementation,
	 * add exception handling to it and complete
	 * the method calculate() below.
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator!");
		System.out.println("Enter your command below:");
		
		
		
		// The calculate method is run in an infinite loop, 
		// i.e. until the program ends
		while (true) {
			calculate();
		}
		
		
	}
	
	/*
	 * Calculate should:
	 * 1. Take input via the Scanner class
	 * 2. Parse the input (this is a part of the Calculator interface)
	 * 3. If it is valid input, output the result
	 * 4. If it is invalid, output an error
	 * 
	 * Because it is in an infinite loop, you only need 
	 * to do those four steps.
	 */
	public static void calculate() {
		
		int num1, num2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first number:");
		
		num1 = scanner.nextInt();
        System.out.print("Enter second number:");
        num2 = scanner.nextInt();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
	}
}
