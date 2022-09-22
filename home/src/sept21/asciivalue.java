package sept21;

import java.util.Scanner;

public class asciivalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter a character");
		Scanner in = new Scanner(System.in);
		char ch;
		ch=in.next().charAt(0);
		int a = ch;
		System.out.println("ascii value is "+a);
	}

}
