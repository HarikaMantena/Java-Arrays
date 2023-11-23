package arrays;

import java.util.Scanner;

import java.util.Scanner;  // Import the Scanner class

public class MaxElement {

    public static void main(String[] args) {
        // Declare variables
        int n;

        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Prompt user to enter the size of the array
        System.out.println("Enter the size of the array");
        n = scan.nextInt();

        // Create an array to store elements
        int a[] = new int[n];

        // Prompt user to enter elements into the array
        System.out.println("Enter " + n + " elements into the array:");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        // Initialize max with the first element of the array
        int max = a[0];

        // Iterate through the array to find the maximum element
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        // Display the maximum element in the array
        System.out.println("Max element in the array: " + max);
    }
}

