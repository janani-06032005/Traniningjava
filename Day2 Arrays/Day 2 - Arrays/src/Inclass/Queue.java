package Inclass;

import java.util.Scanner;

public class Queue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] arr= new int [n];
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int bus = 0; int k = 0;
		for(int i=0;i<n;i++) {
			k=k+arr[i];
			if(k>m) {
				bus++;
				k=arr[i];
			}
		}
		if(k>0) {
			bus++;
		}
		System.out.println(bus);
		

	}

}
