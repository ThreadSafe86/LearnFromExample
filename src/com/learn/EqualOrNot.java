package com.learn;

public class EqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 2, 5, 1, 7, 4 };
		int[] array2 = { 2, 5, 1, 7, 4 };
		checkEquality(array1, array2);
	}

	private static void checkEquality(int[] array1, int[] array2) {

		// TODO 1. Create a equalornot indicator with default true. 2. Set to
		// false
		// if either length is different or if the individual elements arent
		// equal.

		boolean equalOrNot = true;

		if (array1.length == array2.length) {
			for (int i = 0; i < array1.length; i++) {
				if (array1[i] != array2[i])
					equalOrNot = false;
			}
		} else
			equalOrNot = false;

		// Printing Results

		if (equalOrNot)
			System.out.println("The arrays are equal.");
		else
			System.out.println("The arrays aren't equal.");
	}

}
