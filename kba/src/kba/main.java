package kba;

import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		ticket t=new ticket();
		System.out.println("Enter no of bookings:");
		int book=sc.nextInt();
		System.out.println("Enter the available tickets:");
		int available=sc.nextInt();
		t.setAvailableTickets(available);
		while(book>0) {
			
		
		System.out.println("Enter the ticketid:");
		int id=sc.nextInt();
		t.setTicketid(id);
		System.out.println("Enter the price:");
		int price=sc.nextInt();
		t.setPrice(price);
		System.out.println("Enter the no of tickets:");
		int tickets=sc.nextInt();
		if(tickets<=available)
		System.out.println("Available tickets: "+t.getAvailableTickets());
		int amount=t.calculateTicketCost(tickets);
		if(amount==-1)
		System.out.println("Tickets not sufficient / available");
		else
		{
		System.out.println("\nTotal amount:"+amount);
		System.out.println("\nAvailable ticket after booking:"+t.getAvailableTickets());
		}
		book=book-1;
		}
		
		
	}

}
