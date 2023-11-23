package arrays;

public class LeadersArray {

    public static void main(String[] args) {
        // Declare and initialize the array
        int[] arr = {16, 17, 4, 3, 5, 2};
        
        // Get the size of the array
        int size = arr.length;

        // Print message indicating the intention to display leaders in the array
        System.out.println("The leaders in the array are: ");

        // Iterate through the array to find and print leaders
        for (int i = 0; i < size; i++) {
            int j;

            // Iterate from i+1 to the end of the array to compare elements with arr[i]
            for (j = i + 1; j < size; j++) {
                // If an element is greater than or equal to arr[i], break the loop
                if (arr[i] <= arr[j]) {
                    break;
                }
            }

            // If j reaches the end of the array, arr[i] is a leader, print it
            if (j == size) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
