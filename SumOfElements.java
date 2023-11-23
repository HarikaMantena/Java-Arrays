package arrays;

import java.util.Scanner;

import java.util.Scanner;  // Import the Scanner class

public class SumOfElements {

    public static void main(String[] args) {
        // Declare variables
        int size, sum = 0;

        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Prompt user to enter the size of the array
        System.out.println("Enter the size of the array");

        // Read the size of the array from user input
        size = scan.nextInt();

        // Create an array of size 'size' to store elements
        int array[] = new int[size];

        // Prompt user to enter elements into the array
        System.out.println("Enter " + size + " elements into the array:");

        // Read 'size' elements from user input and store them in the array
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        // Calculate the sum of the elements in the array
        for (int i = 0; i < size; i++) {
            sum = sum + array[i];
        }

        // Display the sum of the elements
        System.out.println("Sum = " + sum);
    }
}
