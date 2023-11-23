package arrays;

public class FrequencyOfElements {

    public static void main(String[] args) {
        // Array of elements
        int a[] = {10, 20, 10, 70, 30, 20, 10, 70, 70, 70, 70, 80};

        // Iterate through the array to calculate the frequency of each element
        for (int i = 0; i < a.length; i++) {
            // Current element to find its frequency
            int x = a[i];

            // Variable to track the frequency of the current element
            int count = 0;

            // Skip the iteration if the element has already been processed
            if (x == -1) continue;

            // Iterate through the array to count the frequency of the current element
            for (int j = 0; j < a.length; j++) {
                if (a[j] == x) {
                    // Increment count and mark the element as processed by setting it to -1
                    count++;
                    a[j] = -1;
                }
            }

            // Display the frequency of the current element
            System.out.println("The frequency of element " + x + " is " + count);
        }
    }
}
