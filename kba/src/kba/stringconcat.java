package kba;

import java.util.Scanner;

public class stringconcat {

	public static void main(String[] args) {
		int f=0;
		String name,fname;
		Scanner in = new Scanner(System.in);
		System.out.println("Inmates name:");
		name = in.nextLine();
		
		System.out.println("Inmates fathers name:");
		fname = in.nextLine();
		name=name.concat(" ").concat(fname);
		 for(int i = 0; i < name.length(); i++){
		        char c = name.charAt(i);
		        if(Character.isDigit(c)||c=='+'||c=='!'||c=='@'||c=='#'||c=='%'||c=='$'||c=='^'||c=='&'||c=='*'||c=='('
		                ||c==')'||c=='-'||c=='='||c=='/'||c=='<'||c=='>'||c=='?'||c=='{'||c=='}'||c=='['||c==']'){
		        	f=1;
		        	break;
		        	
		        }
		 }
		 if(f==1) {
		 System.out.println("invalid name");
		 }
		 else {
			 System.out.println(name.toUpperCase());
		 }
	}
}

