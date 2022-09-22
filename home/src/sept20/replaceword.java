package sept20;

import java.util.Scanner;

public class replaceword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*String s1="a batman with bat";  
		String replaceString=s1.replaceAll("bat","snow");//replaces all occurrences of "is" to "was"  
		System.out.println(replaceString);  */
		
		Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        String s=sc.nextLine();
        
        System.out.println("ENTER THE SUB STRING");
        String sub=sc.nextLine();
        
        System.out.println("ENTER THE NEW SUB STRING");
        String subn=sc.nextLine();
        
        String sn=s.replace(sub, subn);
        
        System.out.println(sn);
	}

}
