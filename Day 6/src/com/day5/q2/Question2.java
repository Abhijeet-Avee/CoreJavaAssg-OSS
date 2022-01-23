package com.day5.q2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;
import java.util.Map;

public class Question2 {
	static Map<String, Integer> wordsFrequency(String filename) {
		Map<String, Integer> words = new TreeMap<String, Integer>();
		try (BufferedReader br = new BufferedReader(new FileReader(new File(filename)))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] tokens = line.split(" ");
				for (int i = 0; i <tokens.length; i++) {
					if (words.containsKey(tokens[i])) {
						int count = words.get(tokens[i]) + 1;
						words.put(tokens[i], count);
					} else {
						words.put(tokens[i], 1);
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return words;
	}

	public static void main(String[] args) {
		String filename = "story.txt";
		Map<String,Integer> map = wordsFrequency(filename);
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			System.out.println(entry);
		}
	}
}
