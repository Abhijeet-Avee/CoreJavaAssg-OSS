package com.day4.q4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchExceptionEg {
	private static Scanner in;

	public static void main(String[] args) {
		int num;
		in = new Scanner(System.in);
		do {
			num =0;
			try{
				System.out.println("Please enter a number or enter ‘-1’ if you want to quit");
				num = in.nextInt();
				if (num % 2 == 0)
					System.out.println("You have entered an even number");
				else
					System.out.println("You have entered an odd number");
			} catch (InputMismatchException ex) {
				System.out.println("WARNING: You must enter an integer value!!");
				in.nextLine();
			}
		} while (num!=-1);
	}
}
