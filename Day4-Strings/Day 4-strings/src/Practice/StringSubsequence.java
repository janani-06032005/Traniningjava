package Practice;

import java.util.Scanner;

public class StringSubsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1=sc.next();
		String str2 = sc.next();
		
		System.out.println(check(str1,str2)? 1:0);

	}
	
	public static boolean check(String str1,String str2) {
		int n1 = str1.length();
		int n2= str2.length();
		int count =0;
		for(int i=0,j=0;i<n1 &&j<n2 ;j++) {
			if(str1.charAt(j) == str2.charAt(i)) {
				count ++;
				i++;
				
			}
		}
		return (count == n2);
		
	}

}
