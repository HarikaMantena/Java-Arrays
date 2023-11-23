package arrays;

import java.util.Scanner;

import java.util.Scanner;  // Import the Scanner class

public class ReverseElementsInArray {

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

        // Display message indicating the intention to print the reversed array
        System.out.println("Reversed array:");

        // Iterate through the array in reverse order and print the elements
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
