package Inclass;


class Animal{
	public String color;
	
	public void eat() {
		System.out.println("I can eat(Animal class)");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}

class Dog extends Animal{
	public void eat() {
		System.out.println("I can eat(Dog class)");
	}
	
	public void bark() {
		System.out.println("I can bark");
	}
	
}

class Puppy extends Dog{
	public void eat() {
		System.out.println("I will drink only milk");
	}
	
	public void walk() {
		System.out.println("I am young i cant walk");
	}
}

class Lion extends Animal{
	
	String junglename;
	
	
	public String getJunglename() {
		return junglename;
	}


	public void setJunglename(String junglename) {
		this.junglename = junglename;
	}
	
	


	void roar() {
		System.out.println("I can roar");
	}
}

public class Practice {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		
		Dog dog = new Dog();
		dog.eat();
		dog.bark();
		dog.setColor("Brown");
		System.out.println(dog.getColor());
		
		
		Puppy pup = new Puppy();
		pup.bark();
		pup.setColor("pink");
		System.out.println(pup.getColor());
		pup.eat();
		
		
		
		Lion lion = new Lion();
		lion.roar();
		
		
	}

}
