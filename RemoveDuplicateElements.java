package arrays;

import java.util.Arrays;
import java.util.Scanner;

import java.util.Arrays;  // Import the Arrays class
import java.util.Scanner;  // Import the Scanner class

public class RemoveDuplicateElements {

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

        // Use Arrays.stream().distinct() to remove duplicates and convert to array
        int[] b = Arrays.stream(a).distinct().toArray();

        // Display the array after removing duplicates
        System.out.println("After removing duplicates: ");
        for (int value : b) {
            System.out.print(value + " ");
        }
    }
}

