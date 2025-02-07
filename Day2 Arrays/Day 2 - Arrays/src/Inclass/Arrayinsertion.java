package Inclass;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayinsertion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n+1];
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int pos = sc.nextInt();
		int val = sc.nextInt();
		
		insert(arr,n,pos,val);
		System.out.println(Arrays.toString(arr));
		

	}
	public static void insert(int [] arr,int n,int pos,int val) {
		for(int i=n-1;i >=pos-1 ;i--) {
			arr[i+1]=arr[i];
		}
		n++;
		
		arr[pos-1]=val;
		
	}

}
