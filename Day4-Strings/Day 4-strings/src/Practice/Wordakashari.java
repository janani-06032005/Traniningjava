package Practice;

import java.util.Scanner;

public class Wordakashari {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		wordakshari(sc);

	}
	
	public static void wordakshari (Scanner sc) {
		 String prev = sc.nextLine();
//		 String current = sc.nextLine();
		 
		 char last = prev.charAt(prev.length()-1);
		 while (true) {
			 System.out.println(prev);
			 String current = sc.nextLine();
			 if(current.charAt(0) != last) {
				 break;
			
				 
			 }
			 
			 prev = current;
			 last = current.charAt(0);
			 
		 }
		 
		 
	}
	

}
