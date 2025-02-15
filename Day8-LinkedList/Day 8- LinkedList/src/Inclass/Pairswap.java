package Inclass;

import java.util.Scanner;

public class Pairswap {

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
		list.pairswap();
		list.display1();

	}

}
