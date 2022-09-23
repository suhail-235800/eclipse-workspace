package sept23;

import java.util.LinkedList;

public class linkedclone {

	public static void main(String[] args) {

		// Create a LinkedList of string datatype
		LinkedList<String> l = new LinkedList<String>();
		// Adding some elements to the LinkedList
		l.add("ram");
		l.add("shyam");
		l.add("gyan");
		l.add("dhyan");
		l.add("vyan");
		// Prints the LinkedList elements
		System.out.println("The elements of LinkedList are: " + l);
		// cloning the same above LinkedList
		LinkedList<String> clone = (LinkedList<String>) l.clone();
		System.out.println("Cloned LinkedList: " + clone);

	}

}
