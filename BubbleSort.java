package arrays;

import java.util.Scanner;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// Declare variables
		int size;
		Scanner scan = new Scanner(System.in);

		// Prompt user to enter the size of the array
		System.out.println("Enter the size of the array");

		// Read the size of the array from user input
		size = scan.nextInt();

		// Create an array of size 'size' to store elements
		int a[] = new int[size];

		// Prompt user to enter elements into the array
		System.out.println("Enter " + size + " elements into the array:");

		// Read 'size' elements from user input and store them in the array
		for (int i = 0; i < size; i++) {
			a[i] = scan.nextInt();
		}

		// Bubble sort algorithm to sort the array in ascending order
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (a[i] > a[j]) {
					// Swap elements if they are in the wrong order
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		// Display the sorted array
		System.out.println("The sorted array is:");
		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
