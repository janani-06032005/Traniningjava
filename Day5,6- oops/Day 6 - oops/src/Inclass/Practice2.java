package Inclass;

class Person{
    String name;
	int age;
	void addressdisplay() {
		System.out.println("Address is XXX");
	}
	
	void display (String name , int age) {
		this.name = name;
		this.age = age;
		
		System.out.println("my name is"+name+"and I am "+age);
	}
}

class Student extends Person{
	String dept = "CSE";
	int marks;
	
}

public class Practice2 {

	public static void main(String[] args) {
		Student student = new Student();
		student.display("janani", 19);

	}

}
