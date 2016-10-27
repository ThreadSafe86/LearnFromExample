package com.learn;

import java.util.Scanner;

public class NumberIsBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		int inputNumber = reader.nextInt();
		boolean isBinary = true;
		int tempInt = inputNumber;

		int digit = tempInt % 10;

		if (digit != 0 && digit != 1) {
			isBinary = false;
		}
		while (tempInt % 10 != tempInt) {
			tempInt = tempInt / 10;
			digit = tempInt % 10;
			if (digit != 0 && digit != 1) {
				isBinary = false;
			}
		}
		if (isBinary)
			System.out.println("The number is binary.");
		else
			System.out.println("The number is not binary.");
	}

}
