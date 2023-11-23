package arrays;

public class CommonElements {

    public static void main(String[] args) {
        // Declare and initialize two arrays
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 4, 5, 6, 7};

        // Iterate through the elements of the first array
        for (int i = 0; i < arr1.length; i++) {
            // Iterate through the elements of the second array
            for (int j = 0; j < arr2.length; j++) {
                // Check if the current elements from both arrays are equal
                if (arr1[i] == arr2[j]) {
                    // If equal, print the common element and break the inner loop
                    System.out.print(arr2[j] + " ");
                    break;
                }
            }
        }
    }
}
