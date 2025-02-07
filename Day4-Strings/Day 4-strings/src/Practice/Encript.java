package Practice;

import java.util.Scanner;

public class Encript {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str = sc.next();
		str = encript(str.toCharArray());
		System.out.println(str);
		

	}
	private static String encript(char[] charArray) {
		int n = charArray.length;
		for(int i=0;i<n-1;i=i+2) {
			char t = charArray[i];
			charArray[i]= charArray[i+1];
			charArray[i+1]=t;
			
		}
		return new String (charArray);
	}

}
