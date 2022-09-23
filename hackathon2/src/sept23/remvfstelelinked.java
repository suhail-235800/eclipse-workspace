package sept23;

import java.util.LinkedList;

public class remvfstelelinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating an LinkedList
		LinkedList<String> list = new LinkedList<String>();

		// Use add() method to add elements in the list
		list.add("Geek");
		list.add("for");
		list.add("Geeks");
		list.add("2020");
		list.add("2021");

		// Displaying the list
		System.out.println("LinkedList:\t" + list);

		// Remove the tail using removeLast()
		System.out.println("The last element is removed:\t" + list.removeLast());

		// Displaying the final list
		System.out.println("Final LinkedList:\t" + list);

		// Remove the head using remove()
		System.out.println("The first element is removed:\t" + list.removeFirst());

		// Displaying the final list
		System.out.println("Final LinkedList:\t" + list);

	}

}
