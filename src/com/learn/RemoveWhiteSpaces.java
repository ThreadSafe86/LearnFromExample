package com.learn;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// get input
		@SuppressWarnings("resource")
		Scanner Temp = new Scanner(System.in);
		String s = Temp.nextLine();

		System.out.println(removeSpaces(s));
	}

	private static String removeSpaces(String s) {

		String result = new String();
		char[] charArray = s.toCharArray();
		for (char charTemp : charArray) {
			if (charTemp != ' ')
				result = result + charTemp;
		}
		return result;
	}

}
