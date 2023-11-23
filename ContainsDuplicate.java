package arrays;

public class ContainsDuplicate {

    public static void main(String[] args) {
        // Declare and initialize an array
        int a[] = {10, 5, 1, 15, 2, 3};

        // Flag to indicate whether a duplicate element is found
        boolean duplicate = false;

        // Iterate through the elements of the array
        for (int i = 0; i < a.length; i++) {
            // Nested loop to compare the current element with the rest of the elements in the array
            for (int j = i + 1; j < a.length; j++) {
                // Check if the current element is equal to any subsequent element
                if (a[i] == a[j]) {
                    // If equal, set 'duplicate' flag to true and break the inner loop
                    duplicate = true;
                    break;
                }
                // If 'duplicate' flag is already true, break the outer loop
                if (duplicate) {
                    break;
                }
            }
        }

        // Display the result based on whether the array contains duplicate elements or not
        if (duplicate) {
            System.out.println("The array contains duplicate elements");
        } else {
            System.out.println("The array doesn't contain duplicate elements");
        }
    }
}
