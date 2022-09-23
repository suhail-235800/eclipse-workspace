package sept23;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removehashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> s = new HashSet<String>();
		String[] str = { "hello", "world", "apple", "ball" };
		s.addAll(Arrays.asList(str));
		System.out.println(s);
		s.clear();
		System.out.println(s);

	}

}
