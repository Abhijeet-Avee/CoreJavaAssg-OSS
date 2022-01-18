package com.day4.q1;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream {

	private static byte[] readContent(File file) {
		byte arr[]=null;
		try (DataInputStream input = new DataInputStream(new FileInputStream(file))) {
			int count = input.available();
		    arr = new byte[count];
			// convert file into array of bytes
			input.read(arr);
			// Printing in byte format
			for (byte a : arr) {
				System.out.print(a);
			}
			System.out.println();
			// Printing in char format
			for (byte a : arr) {
				System.out.print((char) a);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return arr;
	}

	public static void main(String[] args) {
		File file = new File("hello");
		readContent(file);
	}
}