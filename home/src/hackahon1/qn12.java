package hackahon1;

import java.util.Scanner;

public class qn12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in =new Scanner(System.in);
		System.out.println("Enter the first number ");
		int a=in.nextInt();
		System.out.println("Enter the second number ");
		int b=in.nextInt();
		System.out.println("Before swaping a and b is "+a+" and "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swapping a and b is "+a+" and "+b);
		
	}

}
