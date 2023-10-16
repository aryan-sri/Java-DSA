import java.util.Scanner;

public class Amazon6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vector = new int[n];

     
        for (int i = 0; i < n; i++) {
            vector[i] = sc.nextInt();
        }

        int minCost = findMinimumCost(vector);
        System.out.println(minCost);

        sc.close();
    }

    public static int findMinimumCost(int[] vector) {
        int n = vector.length;
        int[] dp = new int[n];

     
        for (int i = 0; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

      
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i + j < n) {
                    dp[i + j] = Math.min(dp[i + j], dp[i] + Math.abs(vector[i] - vector[i + j]));
                }
            }
        }
        return dp[n - 1];
    }
}
