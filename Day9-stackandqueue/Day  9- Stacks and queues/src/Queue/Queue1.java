package Queue;



public class Queue1 {
	Node front = null;
	
	
	class Node{
		int data;
		Node next;
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
		
		
	}
	
	public void enqueue(int val) {
		Node node = new Node(val, null);

		if (front == null) {
			front= node;
		}

		else {
			Node temp = front;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public boolean isEmpty() {
		if(front == null) {
			System.out.println("queue is empty");
			return true;
		}
		return false;
	}
	
	public void display() {
		if(!isEmpty()) {
			Node temp = front;
			while(temp!=null) {
				System.out.println(temp.data+" ");
				temp =temp.next;
			}
		}
	}
	
	public void dequeue() {
		if(!isEmpty()) {
			front = front.next;
		}
	}
	
	public int peek() {
		if(!isEmpty()) {
			return front.data;
		}
		return -1;
	}
	
	public int size() {
		if(!isEmpty()) {
			System.out.println("The size of the queue ");
			int count =0;
			Node temp = front;
			while(temp!=null) {
				temp =temp.next;
				count++;
			}
			return count;
		}
		return -1;
	}

}

