package com.learn;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		System.out.println("Input number");
		int inputInt = reader.nextInt();
		sumOfDigits(inputInt);
	}

	private static void sumOfDigits(int inputInt) {
		// TODO Auto-generated method stub
		int tempInt = inputInt;
		int digit = tempInt % 10;
		int sum = digit;
		while (tempInt % 10 != tempInt) {
			tempInt = tempInt / 10;
			digit = tempInt % 10;
			sum = sum + digit;
		}
		System.out.println("Sum of the Digits is " + sum);
	}

}
