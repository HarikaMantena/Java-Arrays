package arrays;

import java.util.Scanner;

import java.util.Scanner;  // Import the Scanner class

public class SeparateEvenOdd {

    public static void main(String[] args) {
        // Declare variables
        int size;

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

        // Display even elements in the array
        System.out.println("Even elements in the array are:");
        for (int i = 0; i < size; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }

        // Display odd elements in the array
        System.out.println("\nOdd elements in the array are:");
        for (int i = 0; i < size; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
