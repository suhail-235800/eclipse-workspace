package sept20;

import java.util.Scanner;

public class bitwisesswap {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number ");
	int a=sc.nextInt();
	System.out.println("Enter the second number ");
	int b=sc.nextInt();
	System.out.println("Before swaping a and b is "+a+" "+b);
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println("After swapping a and b is "+a+" "+b);
}
}
