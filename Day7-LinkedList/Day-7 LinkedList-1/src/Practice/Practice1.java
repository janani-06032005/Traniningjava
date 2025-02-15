package Practice;

//import java.util.LinkedList;

class Linkedlist {
	Node head = null;
	Node tail;
	int size = 0;

	class Node {
		int data;
		Node next;

		public Node(int val, Node next) {
			this.data = val;
			this.next = next;
		}

	}
	
//	INSERTION AT THE END
	
	public void insertend(int val) {
		Node node = new Node(val, null);

		if (head == null) {
			head = node;
		}

		else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
		size++;
	}
	
	
	
//	DISPLAY THE ELEMENTS

	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	
//	RETURN THE INDEX OF VALUE

	public int getindex(int key) {
		if (head == null) {
			return -1;
		}

		Node temp = head;
		int index = 0;
		while (temp != null) {
			if (temp.data == key) {
				return index;
			}
			temp = temp.next;
			index++;
		}
		return -1;
	}
	
	
	
	
//	FIND THE VALUE AT PARTICULAR INDEX

	public int findval(int index) {
		Node temp = head;
		int i = 0;
		while (temp != null) {
			if (i == index) {
				return temp.data;

			}
			i++;
			temp = temp.next;
		}
		System.err.println("Index out of bounds");
		return -1;

	}
	
	
//	INSERT VALUE AT PARTICULAR INDEX
	public void insertindex(int val,int index) {
		if(index ==0) {
			insertbegin(val);
		}else if(index >= size) {
			insertend(val);
		}
		Node temp = head;
		Node node = new Node(val,null);
		int i=0;
		while(temp !=null) {
			if(i == index-1) {
				break;
			}
			i++;
			temp = temp.next;
		}
		node.next = temp.next;
		temp.next = node;
		size++;
		
	}
	
	
	
//	INSERTION AT THE BEGINNING
	
	public void insertbegin(int val) {
		Node node = new Node(val,null);
		if(head== null) {
			head = node;
		}
		node.next=head;
		head=node;
	}
	
	
//	DELETION AT THE BEGINNING
	
	public void deletefirst() {
		if(head == null) {
			System.out.println("underflow !!!!");
		}
		System.out.println(head.data);
		head = head.next;
	
	}
	
	
	
//	DELETION AT THE END
	
	public void deleteend() {
		if(head == null) {
			System.out.println("underflow !!");
		}
		
		Node temp = head;
		Node prevtemp = null;
		while(temp.next != null) {
			prevtemp = temp;
			temp = temp.next;
		}
		System.out.println(temp.data);
		prevtemp.next = null;
	}
	
	
	
//	DELETE AT PARTICULAR INDEX
	
	public void deleteindex(int index) {
		if(index ==0) {
			deletefirst();
		}
		
		else {
			Node temp = head;
			int i =0;
			while(temp.next != null) {
				if(i == index-1) {
					break;
				}
				temp = temp.next;
				i++;
			}
			if(temp.next != null) {
				temp.next = temp.next.next;
			}
		}
	}
	
	
//	FIND THE MAXIMUM ELEMENT IN THE LINKED LIST
	
	public int findmax() {
		if(head == null) {
			return -1;
		}
		Node temp = head;
		
		int max = temp.data;
		while(temp != null) {
			if(temp.data > max) {
				max= temp.data;
			}
			temp = temp.next;
		}
		return max;
	}
	
	
	
//	FIND THE MINIMUM ELEMENT IN THE LINKED LIST
	
	public int findmin() {
		if(head == null) {
			return -1;
		}
		Node temp = head;
		
		int min = temp.data;
		while(temp != null) {
			if(temp.data < min) {
				min = temp.data;
			}
			temp = temp.next;
		}
		return min;
	}
	
	
//	REVERSE A LINKED LIST
	
	
	public void reverse() {
		if(head == null) {
			return ;
		}
		
		Node prev = null;
		Node present = head;
		Node next = present.next;
		
		while(present != null){
			present.next = prev;
			prev = present;
			present = next;
			
			if(next != null) {
				next = next.next;
			}
		}
		head = prev;
	}
	
	
//	COUNT THE NUMBER OF NODES IN LINKEDLIST
	
	public int countnode() {
		Node temp = head;
		int count = 0;

		while (temp != null) {
			temp = temp.next;
			count ++;
		}
		return count;
	}
	
	
	
	
		
	
	
	
}

public class Practice1 {
	

	public static void main(String[] args) {
		Linkedlist list = new Linkedlist();
		list.insertend(10);
		list.insertend(20);
		list.insertend(30);
		list.insertend(40);
		list.insertend(50);
		list.insertend(60);
		list.display();
//		System.out.println(list.getindex(30));
//		System.out.println(list.findval(2));
//		list.insertindex(25,2);
//		list.display();
//		list.insertbegin(0);
//		list.display();
//		list.deletefirst();
//		list.display();
//		list.deleteend();
//		list.display();
//		list.deleteindex(2);
//		list.display();
//		System.out.println(list.findmax());
//		System.out.println(list.findmin());
		list.reverse();
		list.display();
		System.out.println(list.countnode());

	}

}
