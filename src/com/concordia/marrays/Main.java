package com.concordia.marrays;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
//		int[][] numbers = new int[2][3];
//		numbers[0][1] = 1;

		int[][] numbers = { { 1, 2, 3 }, { 5, 5, 5 } };

		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.deepToString(numbers));
	}

}
