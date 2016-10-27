package com.learn;

public class SinglyLinkedList {

	Node head = new Node();
	Node current = head;

	public void add(String value) {
		if (head.getValue() == null) {
			head.setValue(value);
		} else if (head.getNext() == null) {
			current = new Node();
			current.setValue(value);
			head.setNext(current);
		} else {
			Node tmp = new Node();
			tmp.setValue(value);
			current.setNext(tmp);
			current = tmp;
		}
	}

	public void printll() {
		Node curr = head;
		while (curr != null) {
			System.out.println(curr.getValue());
			curr = curr.getNext();
		}
	}

	public static void main(String args[]) {
		SinglyLinkedList linkdList = new SinglyLinkedList();
		linkdList.add("I");
		linkdList.add("am");
		linkdList.add("sanjay");
		linkdList.add("krishna");

		linkdList.printll();
	}

}
