package com.concordia.activities;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number you want to use: ");
		int number = scanner.nextInt();

		MultiplicationUtils utils = new MultiplicationUtils();
		utils.multiplicationTable(number, 1, 5);
//		utils.multiplicationTable(number);
	}

}
