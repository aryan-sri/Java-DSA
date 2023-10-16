import java.util.*;

public class iON {
    public static int selectStoc(int saving, List<Integer> currValue, List<Integer> futureValue) {
        int n = currValue.size();
        int[][] stocks = new int[n][3];

        if (n == 0 || saving == 0) {
            return 0; 
        }

        for (int i = 0; i < n; i++) {
            stocks[i][0] = futureValue.get(i) - currValue.get(i); 
            stocks[i][1] = currValue.get(i); 
            stocks[i][2] = i; 
        }

        Arrays.sort(stocks, (a, b) -> b[0] - a[0]); 

        int totalInvestment = 0;
        int totalProfit = 0;
        int index = 0;

        while (totalInvestment < saving && index < n) {
            if (totalInvestment + stocks[index][1] <= saving) {
                totalInvestment += stocks[index][1];
                totalProfit += futureValue.get(stocks[index][2]) - currValue.get(stocks[index][2]);
            }
            index++;
        }
        if(totalProfit<0)
        {
            return 0;
        }
        return totalProfit;
    }

    public static void main(String[] args) {
        int saving = 500;
        List<Integer> currentValue = new ArrayList<Integer>();
        currentValue.add(150);
        currentValue.add(199);
        currentValue.add(200);
        currentValue.add(168);
        currentValue.add(153);
        
        List<Integer> fV = new ArrayList<Integer>();
        int[] futureValue = {200, 125, 128, 228, 133};
        fV.add(140);
        fV.add(175);
        fV.add(199);
        fV.add(121);
        fV.add(111);
        
        int maxProfit = selectStoc(saving, currentValue, fV);
        
        System.out.println( maxProfit);
    }
}
// import java.util.*;

// public class iON {
//     public static int maxProfit(int saving, List<Integer> currValue, List<Integer> futureValue) {
//         int n = currValue.size();
//         int[][] dp = new int[n + 1][saving + 1];

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= saving; j++) {
//                 if (currValue.get(i - 1) <= j) {
//                     dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - currValue.get(i - 1)] + futureValue.get(i - 1));
//                 } else {
//                     dp[i][j] = dp[i - 1][j];
//                 }
//             }
//         }

//         return dp[n][saving];
//     }

//     public static void main(String[] args) {
//         int saving = 500;
//         List<Integer> currentValue = Arrays.asList(150, 199, 200, 168, 153);
//         List<Integer> futureValue = Arrays.asList(200, 125, 128, 228, 133);

//         int maxProfit = maxProfit(saving, currentValue, futureValue);

//         System.out.println("Maximum profit: $" + maxProfit);
//     }
// }


