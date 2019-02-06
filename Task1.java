/*
* Part of the application for SENLA Java courses.
* Takes in number N and finds all prime numbers in range from 1 to N.
* Implements Sieve of Eratosthenes to filter out non-primes.
*/

import java.util.*;

public class Task1 {
	public static void main(String[] args) {
		//get upper limit value N
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your number:");
		int n = Integer.parseInt(in.nextLine());

		//fill array with natural numbers from 1 to N
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 1; i <= n; i++) {
			al.add(i);
		}

		//use Sieve of Eratosthenes to remove non-primes
		int c = n;
		for(int i = 1; i < c; i++) {
			for(int j = i +1; j < c; j++) {
				if (al.get(j) % al.get(i) == 0) {
					al.remove(j);
					c--;
				}
			}
		}
		
		//print the result
		System.out.println("Primes in range of 1 to " + n);
		System.out.println(al.toString());
	}
}
