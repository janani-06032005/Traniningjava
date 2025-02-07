package Practice;

import java.util.Scanner;

public class Present {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		remove(str1,str2);
		

	}
	public static void remove(String str1,String str2) {
		
		int n = Math.min(str1.length(),str2.length());
		for(int i=0;i<n;i++) {
			boolean present = false;
			if(str1.charAt(i)== str2.charAt(i)) {
				
				present = true;
				break;
			}
			if(!present) {
				System.out.print(str1.charAt(i));
			}
		}
	}

}
