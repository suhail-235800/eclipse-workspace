package sept20;

import java.util.Scanner;

public class reversword {
	
	/*blic static String stringreverse(String str,String ch) {
		
		
		String words[] = str.split(ch);
		String reversed=" ";
		for(String w:words) {
			StringBuilder sb =new StringBuilder(w);
			sb.reverse();
			reversed=reversed+sb.toString()+" ";
			
			
		}
	return reversed.trim();
	}
	*/
	
    public static String reverse(String str)
    {
        
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
            rev += str.charAt(i);
        return rev;
    }



   public static void main(String[] args) {
        System.out.println("Enter string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split("((?=\\\\.)|(?<=\\\\.)|(?=\\\\s)|(?<=\\\\s))");
        
        for(int i=0;i<arr.length;i++)
            System.out.println(reverse(arr[i])+" ");
        



   }



}
