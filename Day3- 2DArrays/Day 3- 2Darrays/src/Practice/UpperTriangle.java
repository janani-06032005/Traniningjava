package Practice;

import java.util.Scanner;

public class UpperTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] arr=new int[n][n];
		
		
		insert(n,arr);
//		display(arr,n);
		if(uppertriangular(arr,n)) {
			System.out.println(" Upper triangular matrix");
		}else {
			System.out.println(" not a Upper triangular matrix");
			
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
	public static boolean uppertriangular(int[][]arr,int n) {
		boolean result = true;
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i][j]!=0) {
					result = false;
					break;
				}
			}
		}
		return result;
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
