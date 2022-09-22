package hackahon1;

import java.util.Scanner;

public class qn23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String rev="";
		Scanner in = new Scanner(System.in);
		System.out.println("enter string to be reversed:");
		String a = in.nextLine();
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			rev=c+rev;
		}
		System.out.println("String after reversal is: "+rev);
	}

}






