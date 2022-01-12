package com.day1.q1;

/**
 * Q1. Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where
F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their average. The output shall look like:
The first 20 Fibonacci numbers are:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
The average is 885.5*/

import java.util.Scanner;

public class Fibonacci {
	// Fibonacci Series and calculating its average
	private static Scanner in;

	public static int fib(int n) {
		if(n==0 || n==1)
			return n;
		else
			return fib(n-1)+fib(n-2);
	}
	
	public static void printFib(int n) {
		float avg = 0;
		System.out.println("Fibonacci Series: ");
		for(int i=0;i<n;i++)
		{
			int num = fib(i);
			System.out.print(" "+num);
			avg+=num;
		}
		System.out.println("\nAverage: "+ avg/n);
	}
	public static void main(String[] args) {
		int n;
		in = new Scanner(System.in);
		System.out.print("Enter number of terms to print: ");
		n = in.nextInt();
		printFib(n);
	}
}
