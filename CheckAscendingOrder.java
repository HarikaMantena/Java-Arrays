package arrays;

import java.util.Scanner;

public class CheckAscendingOrder {

    public static void main(String[] args) {
        // Declare variables
        int n;
        Scanner scan = new Scanner(System.in);

        // Prompt user to enter the size of the array
        System.out.println("Enter the size of the array");

        // Read the size of the array from user input
        n = scan.nextInt();

        // Create an array of size 'n' to store elements
        int a[] = new int[n];

        // Prompt user to enter elements into the array
        System.out.println("Enter " + n + " elements into the array:");

        // Read 'n' elements from user input and store them in the array
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        // Variable to track if the array is sorted in ascending order
        boolean sorted = true;

        // Check if the array is sorted in ascending order
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                // If an element is smaller than the previous one, set 'sorted' to false and break the loop
                sorted = false;
                break;
            }
        }

        // Display the result based on whether the array is sorted in ascending order or not
        if (sorted) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }
    }
}

