package sept20;

import java.util.Scanner;

public class posnegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		int a = in.nextInt();
		if(a>0) {
			System.out.println("positive");
		}
		else if(a==0) {
			System.out.println("zero");
		}
		else {
			System.out.println("negative");
		}
	}

}
