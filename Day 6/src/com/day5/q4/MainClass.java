package com.day5.q4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MainClass {
	
	static double largest(ArrayList<Double> arr) {
		PriorityQueue<Double> queue = new PriorityQueue<>(new Comparator<Double>() {
			@Override
			public int compare(Double d1, Double d2) {
				return Double.compare(d1,d2);
			}
		});
		for(Double num : arr) {
			queue.offer(num);
		}
		System.out.println(queue);
		return queue.poll();
	}
	
	public static void main(String[] args) {
		ArrayList<Double> numbers = new ArrayList<>();
		try(BufferedReader reader = new BufferedReader(new FileReader(new File("data.txt")))){
			String line = null;
			while((line=reader.readLine())!=null) {
				numbers.add(Double.parseDouble(line));
			}
			System.out.println("Largest: "+largest(numbers));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
