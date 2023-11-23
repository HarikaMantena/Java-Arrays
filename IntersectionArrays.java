package arrays;

import java.util.Arrays;

public class IntersectionArrays {

    public static void main(String[] args) {
        // Initialize indices for arrays arr1 and arr2
        int i = 0, j = 0;

        // Declare and initialize arrays
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 4, 5, 6, 7};

        // Get the lengths of arrays arr1 and arr2
        int m = arr1.length;
        int n = arr2.length;

        // Print message indicating the intention to display common elements
        System.out.println("The common elements are:");

        // Iterate through both arrays to find and print common elements
        while (i < m && j < n) {
            if (arr1[i] == arr2[j]) {
                // If elements are equal, print the common element and move both indices
                System.out.println(arr1[i++] + " ");
                j++;
            } else if (arr1[i] < arr2[j]) {
                // If element in arr1 is smaller, move the arr1 index
                i++;
            } else {
                // If element in arr2 is smaller, move the arr2 index
                j++;
            }
        }
    }
}
