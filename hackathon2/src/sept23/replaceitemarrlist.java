package sept23;

import java.util.ArrayList;

public class replaceitemarrlist {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println(list);
		list.set(1, "E");
		System.out.println(list);
	}

}
