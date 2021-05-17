package com.test;

import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
		int i=1,a,b;
		String op;
		Scanner sc = new Scanner(System.in);

		while(i!=0) {
			System.out.println("Enter your first number");
			a=sc.nextInt();
			System.out.println("Enter your second number");
			b=sc.nextInt();
			System.out.println("Enter your Operation");
			System.out.println("a for Addition");
			System.out.println("s for Subtration");
			System.out.println("x for Mulitply");
			System.out.println("d for divide");

			op=sc.next();
			switch(op) {
			case "a":
				System.out.println(FirstProgram.add(a, b));
				break;
			case "s":			
				System.out.println(FirstProgram.minus(a, b));
				break;
			case "x":			
				System.out.println(FirstProgram.multiply(a, b));
				break;
			case "d":		
				System.out.println(FirstProgram.divide(a, b));
				break;
			case "m":		
				System.out.println(FirstProgram.modulus(a, b));
				break;
			}
			System.out.println("Enter 0, if you want to quit.");
			i=sc.nextInt();

		}
		System.out.println("Thank you!");

		
	}
	public static int add(int a,int b) {
		return a+b;
	}
	public static int multiply(int a,int b) {
		return a*b;
	}
	public static int minus(int a,int b) {
		return a-b;
	}
	public static int divide(int a,int b) {
		return a/b;
	}
	public static int modulus(int a,int b) {
		return a%b;
	}
}

