package com.learn;

public class PairOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 4, 5, 7, 11, 9, 13, 8, 12 };
		int givenNumber = 20;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == givenNumber) {
					System.out
							.println("(" + array[i] + ", " + array[j] + "), ");
				}
			}
		}
	}

}
