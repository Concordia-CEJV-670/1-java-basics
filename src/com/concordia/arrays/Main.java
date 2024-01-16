package com.concordia.arrays;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[2] = 4;
//		numbers[10] = 100;
		System.out.println(numbers);
		System.out.println(Arrays.toString(numbers));
		
		int[] numbers2 = {2, 5, 4, 3};
		System.out.println(numbers2.length);
		Arrays.sort(numbers2);
		System.out.println(Arrays.toString(numbers2));
	}

}
