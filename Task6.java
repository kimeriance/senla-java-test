/*
* Part of the application for SENLA Java courses.
* Takes in string and removes all numbers/digits.
*/

import java.util.*;

public class Task6 {
	public static void main(String[] args) {
		String input, output = "";

		//get input string
		Scanner in = new Scanner(System.in);
		System.out.println("Enter text:");
		input = in.nextLine();

		//parse the input to remove digits
		int i = 0;
		while (i <= (input.length() - 1)) {
			if (!Character.isDigit(input.charAt(i)))
				output += input.charAt(i);
			i++;
		}

		//print the result
		System.out.println(output);
	}
}
