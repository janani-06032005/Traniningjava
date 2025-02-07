package DoublyLinkedlist;

public class Practice1 {

	public static void main(String[] args) {
		Doubly1 list = new Doubly1();
		list.insertend(10);
		list.insertend(20);
		list.insertend(30);
		list.insertend(40);
		list.insertend(50);
		list.insertend(60);
		
//		list.display();
		
		list.insertfirst(40);
		list.insertfirst(50);
		list.insertfirst(60);
		
//		list.display();
		
		list.deletefirst();
		
//		list.display();
		
		list.deletelast();
		
//		list.display();
		
		list.insertindex(2, 25);
		list.display();
		
		

	}

}
