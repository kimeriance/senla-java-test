/*
* Part of the application for SENLA Java courses.
* Checks input string for being a palyndrome.
*/

import java.util.*;

public class Task5 {
	public static void main(String[] args) {
		String input, reverse = "";
		
		//get input string
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string.");
		input = in.nextLine();
		input = input.toLowerCase();
		
		//build a reversed string
		int i = input.length() - 1;
		while (i >= 0) {
			reverse += input.charAt(i);
			i--;
		}

		//compare 2 strings to find out if it's a palyndrome
		if (input.equals(reverse))
			System.out.println("It's a palidrome!");
		else
			System.out.println("It's not a palidrome!");
	}
}
