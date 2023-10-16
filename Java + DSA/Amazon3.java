import java.util.Scanner;

public class Amazon3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create an array to store the first index of each element
        int[] firstIndex = new int[2001]; // Assuming the values are in the range [1, 2000]

        // Initialize the result array with default values of -1
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = 0;
        }

        // Iterate through the array to find the first and last index of each element
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            if (firstIndex[num] == 0) {
                // If it's the first occurrence of the element, store its index
                firstIndex[num] = i + 1; // Adding 1 because indices are 1-based
            } else {
                // If it's not the first occurrence, calculate the difference
                result[i] = i - firstIndex[num];
            }
        }

        // Print the results
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
