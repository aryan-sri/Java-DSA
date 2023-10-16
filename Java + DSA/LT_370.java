import java.util.*;
class java
{
    public static int[] Update(int[][] arr, int N)
    {
        int ans[] = new int[N];
        Arrays.fill(ans,0);
        for(int row =0;row<arr.length;row++)
        {
            int s = arr[row][0];
            int e = arr[row][1];
            int u = arr[row][2];
             for(int j = s;j<e;j++)
             {
                ans[j] += u;
             }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] updates = {{1,3,2},
                           {2,4,3},
                           {0,2,-2}};
        int N = 5;
        System.out.println(Arrays.toString(Update(updates, N)));

    }
}