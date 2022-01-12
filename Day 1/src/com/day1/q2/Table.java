package com.day1.q2;

//Q2. Write a program called TimeTable to produce the multiplication table of 1 to 9 as shown using
//two nested for-loops:
//* | 1 2 3 4 5 6 7 8 9
//-------------------------------
//1 | 1 2 3 4 5 6 7 8 9
//2 | 2 4 6 8 10 12 14 16 18
//3 | 3 6 9 12 15 18 21 24 27
//4 | 4 8 12 16 20 24 28 32 36
//5 | 5 10 15 20 25 30 35 40 45
//6 | 6 12 18 24 30 36 42 48 54
//7 | 7 14 21 28 35 42 49 56 63
//8 | 8 16 24 32 40 48 56 64 72
//9 | 9 18 27 36 45 54 63 72 81

import java.util.Scanner;

public class Table {
	
	public static void mulTable(int n)
	{
		for(int i=-1;i<=n;i++)
		{
			if(i==-1)
				System.out.print(" * | ");
			else if(i==0)
				System.out.print("---");
			else
			System.out.print(" "+i + " | ");
			for(int j=1;j<=n;j++)
			{
				if(i==-1)
					System.out.print(" "+ (j));
				else if(i==0)
					System.out.print("---");
				else
				System.out.print(" "+ i*j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = in.nextInt();
		mulTable(n);
		in.close();
	}
}
