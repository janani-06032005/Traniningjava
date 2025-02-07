package Circular;

public class CircularLinkedlist {
	Node head = null;

	class Node {
		int data;
		Node next;

		public Node(int val, Node next) {
			this.data = val;
			this.next = next;
		}
	}

	public void circularinsert(int val) {
		if (head == null) {
			Node node = new Node(val, null);
			head = node;
			node.next = head;
		} else {
			Node node = new Node(val, null);
			Node temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			temp.next = node;
			node.next = head;
		}
	}

	public void circulardisplay() {
		if (head == null) {
			System.out.println("No linkedlist found");
		} else {
			Node temp = head;
			while (temp != head) {
				System.out.print(temp.data + "-->");
				temp = temp.next;
			}
		}
	}

}
