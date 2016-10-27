package com.learn;

import java.util.ArrayList;

public class DuplicateItemsRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("JAVA");
		arrayList.add("J2EE");
		arrayList.add("JSP");
		arrayList.add("SERVLETS");
		arrayList.add("JAVA");
		arrayList.add("STRUTS");
		arrayList.add("JSP");
		System.out.println("list with duplicate items" + arrayList);
		removeDuplicateItems123(arrayList);

	}

	private static void removeDuplicateItems123(ArrayList<String> arrayList) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arrayList.size(); i++) {
			for (int j = i + 1; j < arrayList.size(); j++) {
				if (arrayList.get(i).equals(arrayList.get(j))) {
					arrayList.remove(j);
				}
			}
		}
		System.out.println("list without duplicate items" + arrayList);
	}

}
