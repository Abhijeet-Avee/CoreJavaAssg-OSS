/**
 * Q2. Write a program that runs 5 threads, each thread randomizes a number
between 1 and 10. The main thread waits for all the others to finish, calculates
the sum of the numbers which were randomized and prints that sum. You will
need to implement a Runnable class that randomizes a number and store it in a
member field. When all the threads have done, your main program can go over
all the objects and check the stored values in each object.
 * **/
package com.milestone2.q2;

import java.util.Random;

class Sum implements Runnable{
	private int sum;
	public Sum(int num) {
		this.sum = num;
	}
	@Override
	public void run() {
		Random random = new Random();
		int n = random.nextInt(10)+1;
		synchronized(this){
			System.out.println(Thread.currentThread().getName()+": "+n);
			this.sum += n;
		}
	}
	
	public int getSum() {
		return this.sum;
	}
}

public class Question02 {
	public static void main(String[] args) {
		int sum=0;
		Sum job = new Sum(sum);
		Thread thread1 = new Thread(job, "thread1");
		Thread thread2 = new Thread(job, "thread2");
		Thread thread3 = new Thread(job, "thread3");
		Thread thread4 = new Thread(job, "thread4");
		Thread thread5 = new Thread(job, "thread5");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
			System.out.println("Sum :" + job.getSum());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

