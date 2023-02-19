import java.util.*;
public class linear_srch_2D
{
    public static void main(String[] args) {
        int[][] arr = {
            {21, 43, 14, 53, 24},
            {57, 45, 12 , 40},
            {98 , 36 , 3},
            {20, 85}
        };
        System.out.println("Enter Target");
        int trget = new Scanner(System.in).nextInt();
        int[] ans = search(arr , trget);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr , int trget)
    {
        for(int row =0;row<arr.length;row++)
        {
            for(int coloumn=0; coloumn<arr[row].length;coloumn++)
            {
                if(arr[row][coloumn] == trget)
                {
                    return new int[]{row,coloumn};
                }
            }
        }

        return new int[]{-1,-1};
    }
}
