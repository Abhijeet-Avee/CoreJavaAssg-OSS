package com.day1.q5;

//Q5.
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
//1 2 3 4 5 6
//1 2 3 4 5 6 7
//1 2 3 4 5 6 7 8

import java.util.Scanner;

public class Pattern {
 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Enter number: ");
	int num = in.nextInt();
	for(int i=1;i<=num;i++)
	{
		for(int j=1;j<=i;j++)
			System.out.print(" "+j);
		System.out.println();
	}
}
}
