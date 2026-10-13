
package Circular;

class LinkedList {
	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head, tail;

	public LinkedList() {
		head = tail = null;
	}

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	public void addFirst(int value) {
		Node newNode = new Node(value);
		if (head == null && tail == null) {
			head = newNode;
			tail = newNode;
			tail.next = newNode;
		} else {
			newNode.next = head;
			head = newNode;
			tail.next = head;
		}
	}

	public void addLast(int value) {
		Node newNode = new Node(value);
		if (head == null && tail == null) {
			head = newNode;
			tail = newNode;
			tail.next = newNode;
		} else {
			newNode.next = head;
			tail.next = newNode;
			tail = newNode;
		}

	}

	public void deleteFirst() {
		head = head.next;
		tail.next = head;
	}

	public void deleteLast() {
		Node trav = head;
		while (trav.next.next != head) {
			trav = trav.next;
		}
		trav.next = head;
		tail = trav;
	}

	public void display() {
		if (head == null)
			return;

		System.out.print(" " + head.data);
		Node trav = head.next;

		while (trav != head) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println();
	}

	public void deleteAll() {
		head = tail = null;
	}
}
