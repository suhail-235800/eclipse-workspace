package sept23;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class comparehashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> s1 = new HashSet<Integer>();
		Integer arr1[] = { 1, 4, 7, 8, 3 };
		s1.addAll(Arrays.asList(arr1));
		Set<Integer> s2 = new HashSet<Integer>();
		Integer arr2[] = { 1, 9, 7, 10, 3, 11, 19 };
		s2.addAll(Arrays.asList(arr2));
		Set<Integer> compare = new HashSet<Integer>(s1);
		compare.retainAll(s2);
		System.out.println(compare);

	}

}
