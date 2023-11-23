package arrays;

import java.util.Scanner;

public class AverageOfElements {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Declare variables
        double avg = 0;
        int n;

        // Prompt user to enter the size of the array
        System.out.println("Enter the size of the array");
        
        // Read the size of the array from user input
        n = scan.nextInt();

        // Create an array of size n to store elements
        int a[] = new int[n];

        // Prompt user to enter elements into the array
        System.out.println("Enter " + n + " elements:");

        // Read n elements from user input and store them in the array
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        // Calculate the sum of the elements in the array
        for (int i = 0; i < n; i++) {
            avg = avg + a[i];
        }

        // Calculate the average of the elements
        avg = avg / n;

        // Display the average of the elements
        System.out.println("Average = " + avg);
    }
}
