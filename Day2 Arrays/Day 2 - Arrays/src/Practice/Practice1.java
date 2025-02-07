package Practice;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 6;
		int [] arr = new int[size];
		for(int i =0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
