package training;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class sqlistgrtrandavg {

	public static void main(String[] args) {
		List <Integer> list = new ArrayList<>();
		list.add(25);
		list.add(321);
		list.add(50);
		list.add(7);
		OptionalDouble avg = list.stream().mapToInt(i->i*i).filter(n->(n>100)).average();
		System.out.println("The average of the number which has its squre value more than 100 is ");
		System.out.println(avg);
	}
}
