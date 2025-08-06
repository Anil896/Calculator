package com.intern;
import java.util.*;

public class Calci {

	    // Addition
	    public static double add(double a, double b) {
	        return a + b;
	    }

	    // Subtraction
	    public static double subtract(double a, double b) {
	        return a - b;
	    }

	    // Multiplication
	    public static double multiply(double a, double b) {
	        return a * b;
	    }

	    // Division
	    public static double divide(double a, double b) {
	        if (b == 0) {
	            System.out.println("Error: Division by zero is not allowed.");
	            return 0;
	        }
	        return a / b;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n--- Simple Calculator ---");
	            System.out.println("1. Addition");
	            System.out.println("2. Subtraction");
	            System.out.println("3. Multiplication");
	            System.out.println("4. Division");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            if (choice >= 1 && choice <= 4) {
	                System.out.print("Enter first number: ");
	                double num1 = scanner.nextDouble();

	                System.out.print("Enter second number: ");
	                double num2 = scanner.nextDouble();

	                double result = 0;

	                switch (choice) {
	                    case 1 -> result = add(num1, num2);
	                    case 2 -> result = subtract(num1, num2);
	                    case 3 -> result = multiply(num1, num2);
	                    case 4 -> result = divide(num1, num2);
	                }

	                System.out.println("Result: " + result);
	            } else if (choice != 5) {
	                System.out.println("Invalid choice. Please try again.");
	            }

	        } while (choice != 5);

	        System.out.println("Calculator exited.");
	        scanner.close();
	    }
	}

