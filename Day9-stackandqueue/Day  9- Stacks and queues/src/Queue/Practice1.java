package Queue;

public class Practice1 {

	public static void main(String[] args) {
		Queue1 queue = new Queue1();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		
		queue.display();
		
		System.out.println();
		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		
		queue.display();
		
		System.out.println();
		
		
		System.out.println(queue.peek());
		
		System.out.println(queue.size());
	}

}
