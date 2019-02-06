/*
* Part of the application for SENLA Java courses.
* Takes in number N and finds all Fibonacci numbers less than N.
* Implements recursive function to find Fibonacci numbers.
*/

import java.util.*;

public class Task2 {
	//calculates fibonacci number using it's index
	public static int Fibonacci(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return Fibonacci(n - 1) + Fibonacci(n - 2);
	}

	public static void main(String[] args) {

		//get upper limit value N
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your number:");
		int n = Integer.parseInt(in.nextLine());

		//print all fibonacci numbers in range from 1 to N
		System.out.print("Fibonacci numbers smalle than ");
		System.out.println(n);
		for(int i = 1; Fibonacci(i) <= n; i++) {
			System.out.println(Fibonacci(i));
		}
	}
}
