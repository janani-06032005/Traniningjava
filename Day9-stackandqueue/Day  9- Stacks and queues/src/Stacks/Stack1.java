package Stacks;

public class Stack1 {
	
	Node top = null;
	
	class Node{
		int data;
		Node next;
		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
	}
	
	
	public void push(int val) {
		Node node = new Node(val,null) ;
		node.next = top;
		top = node;
	}
	
	public void display() {
		if(!isEmpty()) {
			Node temp = top;
			while(temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
		else {
			System.out.println("Stack is empty");
		}
	}
	
	public void pop() {
		if(!isEmpty()) {
			top = top.next;
		}
	}
	
	public int peek() {
		if(!isEmpty()) {
			return top.data;
		}
		return -1;
	}

	public boolean isEmpty() {
		if(top == null) {
			return true;
		}
		return false;
	}

}
