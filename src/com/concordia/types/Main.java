package com.concordia.types;

import java.util.Date;

public class Main {

	/*
	 * https://www.w3schools.com/java/java_data_types.asp
	 */
	public static void main(String[] args) {
		// Primitive
		byte age = 20;
		int canadaPopulation = 40_000_000;
		long worldPopulation = 8_000_000_000L;
		float interestRate = 6.75F;
		char grade = 'A';
		boolean isCreditCheckRequired = true;
		
		// Non Primitive
		Date now = new Date();
		System.out.println(now);
	}

}
