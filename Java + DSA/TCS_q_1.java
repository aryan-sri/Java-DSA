// Question : Print the absolute difference between the Diagonals Sum Left to Right and Right to left
//   1232
//   4562          |1+5+9+2| - |2+6+8+2| = Output
//   7892
//   2222
public class TCS_q_1 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {9, 8, 9}};
        int rSum = 0;
        int lSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int c = arr[0].length - i - 1;
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    lSum += arr[i][j];
                }

                if (c == j) {
                    rSum += arr[i][j];
                }
            }
        }

        System.out.println(Math.abs(lSum - rSum));
    }
}
