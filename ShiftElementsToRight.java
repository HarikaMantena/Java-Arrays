package arrays;

import java.util.Scanner;

import java.util.Scanner;  // Import the Scanner class

public class ShiftElementsToRight {

    public static void main(String[] args) {
        // Declare variables
        int size, shifts;

        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Prompt user to enter the size of the array
        System.out.println("Enter the size of the array");
        size = scan.nextInt();

        // Create an array to store elements
        int a[] = new int[size];

        // Prompt user to enter elements into the array
        System.out.println("Enter " + size + " elements into the array:");
        for (int i = 0; i < size; i++) {
            a[i] = scan.nextInt();
        }

        // Display the given array
        System.out.println("Given array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }

        // Prompt user to enter the number of positions to shift
        System.out.println();
        System.out.println("Enter the number of positions to shift");
        shifts = scan.nextInt();

        // Right rotate the array by 'shifts' times
        for (int i = 0; i < shifts; i++) {
            int j, lastElement;

            // Storing the last element of the array to move to start
            lastElement = a[size - 1];

            // Shifting the elements to the right by 1 on each iteration of the loop
            for (j = size - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }

            // Adding the last element at the beginning of the array
            a[0] = lastElement;
        }

        System.out.println();
        // Printing the output array after right rotations
        System.out.println("Array after " + shifts + " right rotations: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
