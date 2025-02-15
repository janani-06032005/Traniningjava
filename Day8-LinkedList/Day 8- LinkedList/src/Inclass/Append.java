package Inclass;

import java.util.Scanner;

public class Append {

	public static void main(String[] args) {
		Linkedlist list = new Linkedlist();
		Scanner sc = new Scanner(System.in);

		while (true) {
			int data = sc.nextInt();
			if (data < 0) {
				break;
			}
			if (list.getindex(data) == -1) {
				list.insertend(data);
			}
		}
		if (list.isempty()) {
			System.out.println("List is Empty");
		} else {
			list.display1();
		}

	}

}
