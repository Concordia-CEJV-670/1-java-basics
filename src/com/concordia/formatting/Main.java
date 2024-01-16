package com.concordia.formatting;

import java.text.NumberFormat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		NumberFormat currency = NumberFormat.getCurrencyInstance();
//		String result = currency.format(123456.123);
//		System.out.println(result);
		
//		NumberFormat percent = NumberFormat.getPercentInstance();
//		String result = percent.format(0.12);
//		System.out.println(result);
		
		String result = NumberFormat.getPercentInstance().format(0.36);
		System.out.println(result);
	}

}
