package sept20;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "welcome",s1="";
		 char c;
		 System.out.println("String:"+s);
		 for(int i = 0;i<s.length();i++) {
			 c=s.charAt(i);
			 s1=c+s1;
		 }
		
		 System.out.println("Reversed String:"+s1);
		 
		
	}

}
