package Inclass;


import java.util.Arrays;


public class Pairthecontainer {

	public static void main(String[] args) {
		int [] arr = {100,560,23,19,15};
		Arrays.sort(arr);
		int i =0;
		int j = arr.length-1;
		
		while(i < j) {
			System.out.println(arr[j] + " "+ arr[i]);
			i++;
			j--;
		}
		if(i==j) {
			System.out.println(arr[j] + " "+ 0);
			
		}
		

	}

}
