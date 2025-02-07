package Practice;

import java.util.Scanner;

public class Introduction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] arr= new int [n][n];
		for(int row=0;row< arr.length;row++) {
			 for(int col =0;col<arr[row].length;col++) {
				 arr[row][col]=sc.nextInt();
			 }
		}
		System.out.println("The matrix elements are :" );
		for(int row=0;row< arr.length;row++) {
			 for(int col =0;col<arr[row].length;col++) {
				 System.out.print(arr[row][col]+ " ");
			 }
			 System.out.println();
		}
		System.out.println("The matrix transpose elements are :" );
		for(int row=0;row< n;row++) {
			 for(int col =0;col<n;col++) {
				 System.out.print(arr[col][row]+ " ");
			 }
			 System.out.println();
		}
	}

}
