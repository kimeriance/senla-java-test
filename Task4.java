/*
* Part of the application for SENLA Java courses.
* Takes in 4 logic values and prints "True" if only 2 of them are True.
* Implements a variation of Disjunctive Normal Form.
*/

import java.util.*;

public class Task4 {
	public static void main(String[] args) {
		Boolean a, b, c, d;
		Boolean isTwoTrue;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 4 Booleans, 1 at a time");
		
		//get 4 booleans from input
		a = Boolean.parseBoolean(in.nextLine());
		b = Boolean.parseBoolean(in.nextLine());
		c = Boolean.parseBoolean(in.nextLine());
		d = Boolean.parseBoolean(in.nextLine());

		//Truth table is 2^4=16 rows large. 
		//Only 6 out of 16 combinations have only 2 True values.
		//Build DNF variation to represent it. 
		isTwoTrue = (!a && !b && c && d) || (!a && b && !c && d) || (!a && b && c && !d) || (a && !b && !c && d) || (a && !b && c && !d) || (a && b && !c && !d);

		//print the result
		System.out.println("Result is:");
		System.out.println(isTwoTrue);
	}
}
