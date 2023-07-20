import java.util.Scanner;

public class SubArray2 {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        printSubarrays(arr, 0, 0);
    }

    public static void printSubarrays(int[] arr, int start, int end) {
        int n = arr.length;

        // Base case: If we have reached the end of the array
        if (start == n) {
            return;
        }

        // If the end index exceeds the array size, move to the next starting index
        if (end == n) {
            printSubarrays(arr, start + 1, start + 1);
            return;
        }

        // Print the subarray from the starting index to the current end index
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Recursively call the function to extend the subarray
        printSubarrays(arr, start, end + 1);
    }
}
