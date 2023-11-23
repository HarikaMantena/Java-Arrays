package arrays;

import java.util.Scanner;

import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        // Declare variables for the number of rows and columns
        int m, n;

        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Prompt user to enter the number of rows and columns of the matrix
        System.out.println("Enter the number of rows and columns of the matrix:");
        m = scan.nextInt();
        n = scan.nextInt();

        // Create arrays for two matrices and the result matrix
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int c[][] = new int[m][n];

        // Prompt user to enter elements in the first matrix
        System.out.println("Enter the elements in matrix 1");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }

        // Prompt user to enter elements in the second matrix
        System.out.println("Enter the elements in matrix 2");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = scan.nextInt();
            }
        }

        // Multiplication of two matrices
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    // Update the result matrix element by element
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Display the product of matrix1 and matrix2
        System.out.println("The product of matrix1 and matrix2 is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}

