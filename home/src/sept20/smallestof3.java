package sept20;

import java.util.Scanner;

public class smallestof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 3 numbers ");
		int a=sc.nextInt();
		int b =sc.nextInt();
		int c = sc.nextInt();
		
		s=((a>b)?a:b);
		s=((s<c)?s:c);
		System.out.println("smallest is"+s);		
		/*if(i<j && i<k) {
			System.out.println("The smallest of the 3 number is "+i);
		}
		else if(j<k && j<i) {
			System.out.println("The smallest of the 3 numbers is "+j);
		}
		else
			System.out.println("The smallest of the 3 numbers is "+k);

		*/
	}

}
