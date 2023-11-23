package arrays;

import java.util.Scanner;

import java.util.Scanner;  // Import the Scanner class

public class ThirdSmallestElement {

    public static void main(String[] args) {
        // Declare variables
        int size;

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

        // Sort the array in ascending order
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // Display the third smallest element in the array
        System.out.println("The third smallest element in the array is: " + array[2]);
    }
}
