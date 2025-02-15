package Stacks;

public class Practice1 {

	public static void main(String[] args) {
		Stack1 stack = new Stack1();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		
		stack.display();
		
		System.out.println("after deletion");
		stack.pop();
		stack.pop();
		stack.display();

	}

}
