package Inclass;

import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); 
	        Linkedlist list = new Linkedlist();
	        int n =0;

	        while (true) {
	            int data = sc.nextInt();
	            if (data < 0) {
	                break;
	            }
	            list.insertend(data);
	            n++;
	        }
	        int last = sc.nextInt();
	        int index = list.countnode()-last;
	        if(index >= 0) {
	        	System.out.println(list.findval(index)+" is the nth node element in the list");
	        }else {
	        	System.out.println("There is no nth node in the list");
	        }

	}

}
