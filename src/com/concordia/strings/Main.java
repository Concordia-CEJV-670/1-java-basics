package com.concordia.strings;

public class Main {

	public static void main(String[] args) {
		String msg = "Hello" + ", how are you ?";
		System.out.println(msg);
		System.out.println(msg.endsWith("?"));
		System.out.println(msg.startsWith("Hey"));
		System.out.println(msg.length());

		// Escape Sequence

		String s1 = "My name is \"Pranav\"";
		System.out.println(s1);

		String s2 = "C:\\path\\...";
		System.out.println(s2);

		String s3 = "Hi\nBye";
		System.out.println(s3);

		String s4 = "Hi\tBye";
		System.out.println(s4);
	}

}
