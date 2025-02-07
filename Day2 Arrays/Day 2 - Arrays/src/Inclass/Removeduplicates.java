package Inclass;

import java.util.Scanner;

public class Removeduplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n+1];
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		for(int i =0;i<n;i++) {
			boolean present = false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					present =true;
					break;
					
				}
				if(present==false) {
					System.out.println(arr[i] +" ");
				}
			}
		}

	}

}
