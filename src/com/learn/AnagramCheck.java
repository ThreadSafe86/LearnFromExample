package com.learn;

import java.util.Hashtable;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO 1. input 2 strings. 2. Pass to anagramCheck.
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter 1st string : ");
		String string1 = reader.nextLine();
		System.out.println("Enter 2nd string : ");
		String string2 = reader.nextLine();
		anagramCheck(string1, string2);
	}

	private static void anagramCheck(String string1, String string2) {

		// TODO 1. create hashtable to store occurrence of each character in
		// string1.
		Hashtable<Character, Integer> charMap = new Hashtable<Character, Integer>();
		boolean yesOrNot = true;
		// 2. store the occurrence of each character in string1.
		for (char tempChar1 : string1.toCharArray()) {
			if (tempChar1 != ' ' && charMap.containsKey(tempChar1))
				charMap.put(tempChar1, charMap.get(tempChar1) + 1);
			else if (tempChar1 != ' ')
				charMap.put(tempChar1, 1);
		}
		// 3. check for each character in string2 as key. If it exists then
		// subtract 1 from value.
		for (char tempChar2 : string2.toCharArray()) {
			if (charMap.containsKey(tempChar2))
				charMap.put(tempChar2, charMap.get(tempChar2) - 1);
		}
		// 4. If all values are 0 then it is an anagram.
		for (char tempChar2 : charMap.keySet())
			if (charMap.get(tempChar2) != 0)
				yesOrNot = false;
		// Printing result
		if (yesOrNot)
			System.out.println("It is an anagram.");
		else
			System.out.println("It is not an anagram.");
	}
}
