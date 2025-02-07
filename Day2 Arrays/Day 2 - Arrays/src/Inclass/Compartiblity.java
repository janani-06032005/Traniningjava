package Inclass;

import java.util.Scanner;

public class Compartiblity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int [] arr1 = new int[n1];
		int [] arr2 = new int [n2];
		
		for(int i =0;i<n1;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n2;i++) {
			arr2[i]=sc.nextInt();
		}
		System.out.println(checkcompartability(arr1,arr2,n1,n2));

	}
	
	public static String checkcompartability(int [] arr1,int [] arr2,int n1,int n2) {
		if(n1 != n2) {
			return "Incompartible";
		}else {
			for(int i=0;i<n1 ;i++) {
					if(arr1[i]<arr2[i]) {
						return "Incompartible";
					}
				}
			}
		return "Compartible";
	}

}
