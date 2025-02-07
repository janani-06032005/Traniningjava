package Inclass;

import java.util.Scanner;

public class Housebuilt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] housepos = new int[n];
		int [] houseno = new int[n];
		int [] position = new int[n];
		
		for(int i =0;i<n;i++) {
			houseno[i]=sc.nextInt();
			int k = sc.nextInt();
			housepos[i]=k;
			position[i]=k;
			
		}
		bubblesort(position,n);
		
		int max=0 , x1=0,x2=0;
		for(int i=0;i<n-1;i++) {
			int diff = position[i+1]-position[i];
			
			if(diff > max) {
				max = diff;
				x1=position[i];
				x2=position[i+1];
			}
			
		}
		int n1=0,n2=0;
		for(int i=0;i<n;i++) {
			if(housepos[i]==x1) {
				n1=houseno[i];
			}else if(housepos[i]==x2) {
				n2=houseno[i];
			}
		}
		System.out.println((n1<n2) ? n1 +" "+n2 : n2+" "+n1);
		
		
		
		
		

	}
	public static void bubblesort(int [] arr,int n) {
		for(int i=0 ; i<n;i++) {
			for (int j = 0; j <n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
		}
	}

}

}
