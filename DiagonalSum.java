package arrays;

import java.util.Scanner;

public class DiagonalSum {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Declare variables for the number of rows and columns
        int rsize, csize;

        // Initialize sum of diagonal elements
        int sum = 0;

        // Prompt user to enter the number of rows
        System.out.println("Enter the number of rows");
        rsize = scan.nextInt();

        // Prompt user to enter the number of columns
        System.out.println("Enter the number of columns");
        csize = scan.nextInt();

        // Create a 2D array to store matrix elements
        int a[][] = new int[rsize][csize];

        // Prompt user to enter elements into the matrix
        System.out.println("Enter elements into the matrix");
        for (int i = 0; i < rsize; i++) {
            for (int j = 0; j < csize; j++) {
                a[i][j] = scan.nextInt();
            }
        }

        // Calculate the sum of diagonal elements
        for (int i = 0; i < rsize; i++) {
            sum += a[i][i];
        }

        // Display the sum of diagonal elements
        System.out.println("The sum of diagonal elements is " + sum);
    }
}

