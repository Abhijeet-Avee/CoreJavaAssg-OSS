package com.test.q1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<Merchandise> inventory = new ArrayList<Merchandise>();
		String itemCode;
		int quantity;
		double unitPrice;
		try (BufferedReader br = new BufferedReader(new FileReader(new File("input.dat")))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] tokens = line.split(" ");
				itemCode = tokens[0];
				quantity = Integer.parseInt(tokens[1]);
				unitPrice = Double.parseDouble(tokens[2]);
				inventory.add(new Merchandise(itemCode,quantity,unitPrice));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("---------------BEFORE SORTING----------------");
		System.out.println(inventory);
		System.out.println("\n----AFTER SORTING BY ITEMCODE (ASCENDING ORDER)------");
		Collections.sort(inventory, new MerchandiseSortByNames());
		System.out.println(inventory);
		System.out.println("\n----AFTER SORTING BY PRICE (DESCENDING ORDER)-----");
		Collections.sort(inventory, new MerchandiseSortByPrice());
		System.out.println(inventory);
	}
}
