package com.concordia.activities;

public class MultiplicationUtils {

	void multiplicationTable(int number) {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d", number, i, number * i).println();
		}
	}

	void multiplicationTable(int number, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", number, i, number * i).println();
		}
	}

}
