package Practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palindrome = sc.nextLine();
		
		System.out.println(ispalindrome(palindrome));

	}
	static String ispalindrome(String str) {
		if(str == null || str.length() ==0) {
			return "Palindrome";
		}
		
		
		str = str.toLowerCase();
		for(int i=0;i<str.length()/2;i++) {
			char start = str.charAt(i);	
			char end = str.charAt(str.length()-1-i);
			
			
			if(start != end) {
				return "not palindrome";
			}
		}
		return "palindrome";
	}
	
	

	

}
