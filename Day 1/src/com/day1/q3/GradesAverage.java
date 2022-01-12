package com.day1.q3;

//Q3. Write a program called GradesAverage, which prompts user for the number of students, reads it
//from the keyboard, and saves it in an int variable called numStudents. It then prompts user for the
//grades of each of the students and saves them in an int array called grades. Your program shall
//check that the grade is between 0 and 100. A sample session is as follow:
//Enter the number of students: 3
//Enter the grade for student 1: 55
//Enter the grade for student 2: 108
//Invalid grade, try again...
//Enter the grade for student 2: 56
//Enter the grade for student 3: 57
//The average is: 56.0

import java.util.Scanner;

public class GradesAverage {
	
	private static Scanner in;

	public static void gradeFunc(int num)
	{
		int grade, avg=0;
		in = new Scanner(System.in);
		int [] grades = new int[num];
		for(int i=0;i<num;)
		{
			System.out.print("Enter the grade for student "+(i+1)+": ");
			grade = in.nextInt();
			if(grade>=0 && grade<=100) {
				avg+= grade;
				grades[i] = grade;
				i++;
			}
			else {
				System.out.println("Invalid grade, try again...");
			}
		}
		System.out.println("Average grades: "+avg/num);
	}

	public static void main(String[] args) {
		int numStudents;
		in = new Scanner(System.in);
		System.out.print("Enter number of Students: ");
		numStudents = in.nextInt();
		gradeFunc(numStudents);
	}
}
