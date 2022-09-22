package hackahon1;

import java.util.Scanner;

public class qn11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,sum=0,pro=0;
		Scanner in = new Scanner(System.in);
		System.out.println("enter 1st number");
		a=in.nextInt();
		System.out.println("enter 2nd number");
		b=in.nextInt();
		sum=a+b;
		pro=a*b;
		System.out.println("sum is:"+sum);
		System.out.println("product is:"+pro);
		
	}

}
