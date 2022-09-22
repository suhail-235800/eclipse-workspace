package sept21;

import java.util.Scanner;

public class armstrong {
	
	static void isarmstrong(int n) {
		int c=0,d,t;
		int s=0;
		t=n;
		while(n>0) {
			c=c+1;
			n=n/10;
		}
		n=t;
		while(n>0) {
			d=n%10;
			s=(int) (s+(Math.pow(d,c)));
			n=n/10;
		}
		if(s==t) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		a=in.nextInt();
		isarmstrong(a);
		
	}

}
