package arrays;

public class MajorityElement {
    public static void main(String[] args) {
        // Array to find the majority element in
        int[] array = {2, 2, 1, 1, 1, 2, 2};
        int n = array.length; // Length of the array
        int majorityElement = -1; // Variable to store the majority element

        // Iterate through the array to find the majority element
        for (int i = 0; i < n; i++) {
            int count = 0; // Counter to track the frequency of the current element

            // Nested loop to count the frequency of the current element
            for (int j = 0; j < n; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }

            // Check if the frequency is greater than n/2
            if (count > (n / 2)) {
                majorityElement = array[i];
                break;  // No need to continue checking once the majority element is found
            }
        }

        // Display the result based on whether a majority element was found or not
        if (majorityElement != -1) {
            System.out.println("The majority element is " + majorityElement);
        } else {
            System.out.println("No majority element found");
        }
    }
}
