package arrays;

import java.util.Scanner;

import java.util.Scanner;  // Import the Scanner class

public class SecondLargestElement {

    public static void main(String[] args) {
        // Declare variables
        int n, temp;

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

        // Perform bubble sort to arrange elements in ascending order
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    // Swap elements if they are in the wrong order
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // Display the second largest element in the sorted array
        System.out.println("The second largest element in the array is " + a[n - 2]);
    }
}
