package Practice;

public class Gcd {

	public static void main(String[] args) {
		findgcd(8,4);
		eucledian(8,4);

	}
	public static void findgcd(int n1,int n2) {
		for(int i=Math.min(n1, n2);i>0;i--) {
			if(n1%i==0 && n2%i==0 ) {
				System.out.println(i);
				break;
			}
		}
	}
	
	public static void eucledian(int a,int b) {
		while(b != 0) {
			int t = b;
			b = a%b;
			a=t;
		}
		System.out.println(a);
	}

}
