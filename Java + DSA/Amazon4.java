import java.util.Scanner;

public class Amazon4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        int result = addUntilSingleDigit(number);
        sc.close();
    }
    
    public static int addUntilSingleDigit(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10; // Add the last digit to the sum
                num /= 10;       // Remove the last digit
            }
            num = sum; // Assign the sum as the new number for the next iteration
        }
        return num; // The final single-digit result
    }
}

