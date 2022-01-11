package day1;

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
