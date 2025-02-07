package Inclass;

interface Mom {
	void eat();
	void address();

}
interface Dad{
	void eat();
	void drive();
}

class Child implements Mom , Dad{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		System.out.println("I can eat by my own");
		
	}

	@Override
	public void address() {
		// TODO Auto-generated method stub
		
	}
	
}

class Solution{
	public static void main(String [] args) {
		Child child = new Child();
		child.eat();
		
	}
}
