package com.learn;

import java.util.Arrays;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findSubArray(new int[] { 42, 15, 12, 8, 6, 32 }, 26);

		findSubArray(new int[] { 12, 5, 31, 13, 21, 8 }, 49);

		findSubArray(new int[] { 15, 51, 7, 81, 5, 11, 25 }, 41);

	}

	private static void findSubArray(int[] array, int givenNumber) {
		// TODO Auto-generated method stub
		int sum = array[0];
		int start = 0;
		for (int i = 1; i < array.length; i++) {
			sum = sum + array[i];
			while (sum > givenNumber && start <= i - 1) {
				sum = sum - array[start];
				start++;
			}
			if (sum == givenNumber) {
				System.out.println("Continuous sub array of "
						+ Arrays.toString(array) + " whose sum is "
						+ givenNumber + " is ");

				for (int j = start; j <= i; j++) {
					System.out.print(array[j] + " ");
				}

				System.out.println();
			}
		}
	}
}
