package Practice;

import java.util.Scanner;

public class Sumofzigzag {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] arr=new int[n][n];
		insert(n,arr);
		int ans =sumzigzag(arr,n);
		System.out.println("Sum of Zig-Zag pattern is :" + ans);
	}
	public static int sumzigzag(int [][] arr,int n) {
		int sum =0;
		for(int i=0;i<n;i++) {
			sum += arr[0][i];
			sum += arr[n-1][i];
		}
		for(int i=1;i<n-1;i++) {
			sum+=arr[i][n-1-i];
		}
		return sum;
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

}
