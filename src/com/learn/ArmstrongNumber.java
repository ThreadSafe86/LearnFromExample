package com.learn;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Please, enter a three digit number");
		int inputInt = reader.nextInt();
		// int inputInt= 489;

		armstrongCheck(inputInt, reader);
	}

	private static void armstrongCheck(int inputInt, Scanner reader) {
		while ((inputInt > 999) || (inputInt < 100)) {
			System.out
					.println("The number you entered is not 3 digits. Try again.");
			inputInt = reader.nextInt();
		}
		// TODO 1. extract individual digits
		int a = inputInt % 10;
		int tempInt = inputInt / 10;
		System.out.println(a + " " + tempInt);
		int b = tempInt % 10;
		tempInt = tempInt / 10;
		System.out.println(b + " " + tempInt);
		int c = tempInt % 10;
		System.out.println(c);
		if (inputInt == ((a * a * a) + (b * b * b) + (c * c * c)))
			System.out.println("It is an armstrong number.");
		else
			System.out.println("It is not an armstrong number.");
	}

}
