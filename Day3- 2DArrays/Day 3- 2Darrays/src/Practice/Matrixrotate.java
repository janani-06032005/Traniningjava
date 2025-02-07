package Practice;

import java.util.Scanner;

public class Matrixrotate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] arr=new int[n][n];
		insert(n,arr);
		matrixrotate(arr,n);
		
		

	}
	public static void matrixrotate(int[][]arr,int n) {
		for(int i =0;i<n;i++) {
			for(int j=n-1;j>=0;j--) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] insert(int n,int[][]arr) {
		Scanner sc = new Scanner(System.in);
		for(int row=0;row< n;row++) {
			 for(int col =0;col<n;col++) {
				arr[row][col]=sc.nextInt();
			 }
		}
		return arr;
	}
	public static void display(int[][]arr,int n){
//		System.out.println("The matrix elements are :" );
		for(int row=0;row< n;row++) {
			 for(int col =0;col<n;col++) {
				 System.out.print(arr[row][col]+ " ");
			 }
			 System.out.println();
		}
	}
}
