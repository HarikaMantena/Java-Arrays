package arrays;

import java.util.Arrays;

import java.util.Arrays; // Import the Arrays class for using toString() method

public class MergeTwoArrays {

    public static void main(String[] args) {
        // Declare and initialize two arrays
        int arr1[] = {1, 2, 3};
        int arr2[] = {4, 5, 6};

        // Create an array to store the merged result
        int mergedArray[] = new int[arr1.length + arr2.length];

        // Copy elements from arr1 to the mergedArray starting from index 0
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);

        // Copy elements from arr2 to the mergedArray starting from the end of arr1
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);

        // Display the merged array using Arrays.toString()
        System.out.println("The merged array is: " + Arrays.toString(mergedArray));
    }
}

