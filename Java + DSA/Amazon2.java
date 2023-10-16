import java.util.Scanner;

public class Amazon2 {

    public static int calculateValue(String s) {
        int value = 0;
        boolean hasDigit = false;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                value = value * 10 + Character.getNumericValue(c);
                hasDigit = true;
            }
        }

        if (!hasDigit) {
            value = s.length();
        }

        return value;
    }

    public static int maxProduct(String[] arr) {
        int maxProduct = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int value1 = calculateValue(arr[i]);
                int value2 = calculateValue(arr[j]);
                int product = value1 * value2;

                maxProduct = Math.max(maxProduct, product);
            }
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        ob.nextLine(); 
        String nums[] = new String[n];
        for (int i = 0; i < n; i++) {
            nums[i] = ob.nextLine();
        }
        int result = maxProduct(nums);
        System.out.println(result);
    }
}
