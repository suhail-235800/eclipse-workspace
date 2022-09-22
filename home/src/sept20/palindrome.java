package sept20;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		String b="";
		System.out.println("enter the string :");
		String a = sc.next();
		String t=a;
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		if(b.compareTo(t)==0) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("not palindrom");
		}

	}

}
