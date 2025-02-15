package Inclass;

import java.util.Scanner;

public class Main {

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
	        list.deletefirst();
	        list.display1(); 


	}

}
