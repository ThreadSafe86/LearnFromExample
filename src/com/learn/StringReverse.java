package com.learn;

public class StringReverse {

	public static void main(String[] args) {
		// String str="Hello";
		// System.out.println(str.substring(1));
		String str = "Sanjay Krishna";
		System.out.println(reverseString(str));
	}

	private static String reverseString(String str) {
		if (null == str || str.length() == 1) {
			return str;
		}
		return reverseString(str.substring(1)) + str.charAt(0);
	}

}
