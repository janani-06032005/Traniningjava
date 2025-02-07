package Inclass;

import java.util.Scanner;

public class DeleteSecondLast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Linkedlist list = new Linkedlist();

		while (true) {
			int data = sc.nextInt();
			if (data < 0) {
				break;
			}
			list.insertend(data);
		}
		int index = list.countnode() - 2;
		if (index >= 0) {
			list.deleteindex(index);
			list.display1();
		} else {
			System.out.println("Deletion of second last element is not possible");
		}

	}

}
