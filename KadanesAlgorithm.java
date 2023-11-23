package arrays;

import java.util.Scanner;

import java.util.Scanner;

public class KadanesAlgorithm {

    public static void main(String[] args) {  
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);  

        // Prompt user to enter the size of the array
        System.out.print("Enter the size of the array : ");  
        int n = sc.nextInt();  

        // Create an array to store elements
        int[] arr = new int[n];  

        // Prompt user to enter elements into the array
        System.out.println("Enter the elements of the array : ");  
        for(int i = 0; i < n; i++) {  
            arr[i] = sc.nextInt();  
        }  

        // Variables to track maximum sum
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;  

        // Iterate through the array to find the maximum contiguous sum using Kadane's algorithm
        for(int i = 0; i < n; i++) {  
            max_ending_here += arr[i];  
              
            // Update max_so_far if the current sum is greater
            if(max_so_far < max_ending_here) {  
                max_so_far = max_ending_here;  
            }  

            // Reset max_ending_here if it becomes negative
            if(max_ending_here < 0) {  
                max_ending_here = 0;  
            }  
        }  

        // Display the maximum contiguous sum in the array
        System.out.print("The Maximum contiguous sum in the array is : " + max_so_far);  
    }  
}
