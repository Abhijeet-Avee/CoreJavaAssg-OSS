package com.day4.q5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	private static Scanner in;

	public static void main(String[] args) {
		int num;
		in = new Scanner(System.in);
		do {
			num = 0;
			try {
				System.out.println("Please enter a number or enter ‘-1’ if you want to quit");
				num = in.nextInt();
				if(num==-1)
					System.exit(0);
				if(num>100)
					throw new Exception();
				if (num % 2 == 0)
					System.out.println("You have entered an even number");
				else
					System.out.println("You have entered an odd number");
			} catch (InputMismatchException ex) {
				System.out.println("WARNING: You must enter an integer value!!");
				in.nextLine();
			}catch(Exception ex) {
				System.out.println("WARNING: Number can't be greater than 100");
			}
		} while (true);
	}
}
