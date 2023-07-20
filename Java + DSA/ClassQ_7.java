import java.util.Arrays;

public class ClassQ_7 {
    public static int frequency(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 3, 3, 3, 3, 4, 5 };
        int[] freq = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            freq[i] = frequency(arr, arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (freq[j] < freq[j + 1]) {

                    int temp = freq[j];
                    freq[j] = freq[j + 1];
                    freq[j + 1] = temp;

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
