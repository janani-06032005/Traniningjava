package Practice;

import java.util.Scanner;

public class Spiralmatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int [][] arr=new int[row][col];
		insert(row,arr);
		
		int rs = 0;
		int re=row-1;
		int cs =0;
		int ce = col-1;
		
		while(true) {
			for(int i=cs;i<=ce;i++) {
				System.out.print(arr[rs][i]+" ");
			}
			rs ++;
			
			if(rs>re || cs>ce) {
				break;
			}
			for(int i=rs;i<=re;i++) {
				System.out.print(arr[i][ce]+" ");
			}
			ce --;
			
			if(rs>re || cs>ce) {
				break;
			}
			for(int i=ce;i>=cs;i--) {
				System.out.print(arr[re][i]+" ");
			}
			re --;
			
			if(rs>re || cs>ce) {
				break;
			}
			for(int i=re;i>=rs;i--) {
				System.out.println(arr[re][cs]+" ");
			}
			cs ++;
			
			if(rs>re || cs>ce) {
				break;
			}
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

}
