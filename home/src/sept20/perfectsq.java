package sept20;

import java.util.Scanner;

public class perfectsq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,i;
		double sq;
		Scanner in = new Scanner(System.in);
		n= in.nextInt();
		sq=Math.sqrt(n);
		if((sq - Math.floor(sq)) == 0){
			System.out.println("perfect number");
		}
		else {
			System.out.println("not perfect number");
		}
		
	}

}
