package sept23;

import java.util.PriorityQueue;

public class firstelepriorityq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();

		pq1.add(10);
		pq1.add(22);
		pq1.add(36);
		pq1.add(25);
		pq1.add(16);
		pq1.add(70);
		pq1.add(82);
		pq1.add(89);
		pq1.add(14);
		System.out.println("Original Priority Queue: " + pq1);
		System.out.println("The first element of the Queue: " + pq1.peek());

	}

}
