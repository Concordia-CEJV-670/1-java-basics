package com.concordia.input;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.println("What's your age?");
//		int age = scanner.nextInt();
//		System.out.println("You're " + age + " years old");
		
//		System.out.println("What's your name");
//		String name = scanner.next();
//		System.out.println("You're " + name);
		
		System.out.println("What's your name");
		String fullName = scanner.nextLine();
		System.out.println("You're " + fullName);
	}

}
