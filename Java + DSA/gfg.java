import java.util.Arrays;

class Solution
{
    public static int[] solveQueries(int[] nums, int[][] Queries, int k)
    {
        // Code here 
        
        int[] res = new int[Queries.length];
        for(int  i = 0;i<res.length;i++)
        {
            res[i] = calculate(nums, Queries[i][0] , Queries[i][1], k);
            
        }
        return res;
    }
    public static int calculate(int[] nums, int start , int end , int k)
    {
        int count =0;
        while(start<=end)
        {
            int c2 =0;
            for(int i =0;i<nums.length;i++)
            {
                if(start == nums[i])
                {
                    c2++;
                }
            }
            if(c2>=k)
            {
                count++;
            }
            start++;
        }
        return count;
    }

    public static void main(String[] args) {
        
        int[] nums = {6,10, 2, 2};
        int k = 2;
        int q[][] =  {{1, 5},
            {2 ,4}};
        System.out.println(Arrays.toString(solveQueries(nums,q,k)));
    }
}