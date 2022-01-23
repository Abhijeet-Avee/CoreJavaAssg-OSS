package com.day4.q7;

import java.io.IOException;
import java.util.InputMismatchException;

public class DemoException {
	
	public static void throwException() {
		throw new InputMismatchException();
	}
	
	public static void main(String[] args) {
		throwException();
	}
}
