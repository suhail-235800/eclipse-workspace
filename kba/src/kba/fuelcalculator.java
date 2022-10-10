package kba;

import java.util.Scanner;

public class fuelcalculator {

	public static void main(String[] args) {
		
		double q,d;
		double res,fin;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of liters to fill the tank");
		q=in.nextInt();

		if(q<1)
		{
		System.out.println(q+"is invalid output");
		System.exit(0);
		}
		System.out.println("Enter the distance covered");
		d=in.nextInt();
		if(d<1)
		{
		System.out.println(d+"is invalid output");
		System.exit(0);
		}
		System.out.println("liters/100km");
		System.out.println(String.format("%.2f",(q/d)*100));
		System.out.println("miles/gallon");
		System.out.println( String.format("%.2f",(d*0.6214/(q*0.2642))));

		}
		
		
	

}
