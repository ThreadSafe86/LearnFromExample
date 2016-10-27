package com.learn;

import java.util.HashMap;
import java.util.Scanner;

public class FindDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner iNo=new Scanner(System.in);
		String inputString = iNo.nextLine();
		findDuplicateChars(inputString);
		
	}

	private static void findDuplicateChars(String inputString) {
		// TODO Auto-generated method stub
		// Hashmap to keep count
		HashMap<Character, Integer> myMap= new HashMap<Character, Integer>();
		// going through the string. If the character has been encountered before it 
		// will add 1 to it, else, will create a new entry.
		for (char tempChar1:inputString.toCharArray()){
			if(myMap.containsKey(tempChar1))myMap.put(tempChar1,myMap.get(tempChar1)+1);
			else myMap.put(tempChar1, 1);
		}
		// Printing what we need
		for (char tempChar2:myMap.keySet()) {
			if (myMap.get(tempChar2)>1)System.out.println(tempChar2+" : "+myMap.get(tempChar2));
		}
	}

}
