package training;

import java.util.ArrayList;
import java.util.List;

public class nostrng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> l = new ArrayList <String> ();
		l.add("apple");
		l.add("banana");
		l.add("grape");
		/*for(String f:l) {
			
			if(f.length()>5) {
				c++;
			}
		}*/
		long c = l.stream().filter(str -> str.length()>5).count();
		System.out.println("no of strings is:"+c);
		
	}

}
