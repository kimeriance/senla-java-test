/*
* Part of the application for SENLA Java courses.
* Takes in array of integers and sorts by descending.
* Implements simplest Bubble Sort.
*/

import java.util.*;

public class Task3 {
	public static void main(String[] args) {
		//get array size S and create the array
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size:");
		int S = Integer.parseInt(in.nextLine());
		int[] A = new int[S];

		//fill in the array using input values
		System.out.println("Enter " + S + " array numbers:");
		for(int i = 0; i < A.length; i++)
			A[i] = Integer.parseInt(in.nextLine());

		//bubble sort the array by descending
		int temp;
		for(int i = 0; i < A.length; i++) {
			for(int j = 1; j < A.length; j++) {
				if (A[j-1] < A[j]) {
					temp = A[j-1];
					A[j-1] = A[j];
					A[j] = temp;
				}
			}
		}

		//print out the sorted array
		System.out.print("Array sorted from MAX to MIN: ");
		for(int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
		System.out.println();
	}
}
