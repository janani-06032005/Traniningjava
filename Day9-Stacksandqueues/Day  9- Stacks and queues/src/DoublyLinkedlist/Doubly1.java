package DoublyLinkedlist;



public class Doubly1 {
	Node head = null;
	Node tail = null;
	
	class Node{
		Node prev;
		int data;
		Node next;
		public Node( Node prev,int data, Node next) {
			super();
			this.prev = prev;
			this.data = data;
			this.next = next;
		}
		
		
	}
	
	public void insertend(int data) {
		Node node = new Node(null,data,null);
		if(head == null) {
			head = node;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			node.prev=temp;
		}
	}
	
	public void display() {
		if(!isEmpty()) {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.data+" <=> ");
				temp =temp.next;
			}
			System.out.println("END");
		}
	}

	public  boolean isEmpty() {
		return (head==null);
	}
	
	public void insertfirst(int data) {
		Node node = new Node(null,data,null);
		if(head== null) {
			head = node;
		}
		node.next = head;
		head.prev = node;
		head = node;
	}
	
	public void deletefirst() {
		if(head != null) {
			if(head.next != null) {
				Node temp = head;
				head=head.next;
				head.prev =null;
				temp.next =null;
			}
			else {
				head=null;
			}
		}
	}
	public void deletelast() {
		if(head != null) {
			if(head.next != null) {
				Node temp1 = head;
				while(temp1.next.next != null) {
					temp1 = temp1.next;
				}
				Node temp2 = temp1.next;
				temp1.next =  null;
				temp2.prev = null;
			}
		}
		else {
			head=null;
		}
		
	}
	public int size() {
		if(!isEmpty()) {
			Node temp = head;
			int count =0;
			while(temp!=null) {
				System.out.print(temp.data+" <=> ");
				temp =temp.next;
				count++;
			}
			System.out.println("END");
			return count;
		}
		return -1;
	}
	
	
	public void insertindex(int data,int index) {
		Node node = new Node(null,data,null);
		int i =0;
		Node temp1 = head;
		while(temp1.next !=null) {
			if(i==index-1) {
				break;
			}
			temp1 = temp1.next;
			i++;
		}
		
	}
	
	

}
