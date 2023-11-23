package arrays;

import java.util.Scanner;

public class ElementPresent {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Declare variables for the size of the array and the search element
        int size, searchElement;

        // Prompt user to enter the size of the array
        System.out.println("Enter the size of the array");
        size = scan.nextInt();

        // Create an array of size 'size' to store elements
        int a[] = new int[size];

        // Prompt user to enter elements into the array
        System.out.println("Enter " + size + " elements into the array:");
        for (int i = 0; i < size; i++) {
            a[i] = scan.nextInt();
        }

        // Prompt user to enter the search element
        System.out.println("Enter the search element");
        searchElement = scan.nextInt();

        // Variable to track if the search element is found
        boolean found = false;

        // Iterate through the array to check if the search element is present
        for (int i = 0; i < size; i++) {
            if (a[i] == searchElement) {
                // If found, set 'found' flag to true and break the loop
                found = true;
                break;
            }
        }

        // Display the result based on whether the search element is present in the array or not
        if (found) {
            System.out.println(searchElement + " is present in the array");
        } else {
            System.out.println(searchElement + " is not present in the array");
        }
    }
}
