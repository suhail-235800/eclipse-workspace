package training;
import java.util.*;
import java.util.stream.IntStream;

public class atos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {8,9,3,4,5};
		Arrays.sort(a);
	//	for(int i:a)  
		//	System.out.print(i);
		IntStream strm = Arrays.stream(a);
		strm.forEach(ar -> System.out.print(ar + " "));
				
		

	}

}
