package Inclass;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestMissingpositive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int miss =1;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==miss) {
				miss++;
			}
		}
		System.out.println("missing value is "+miss);

	}

}
