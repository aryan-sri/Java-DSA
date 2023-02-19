public class LT3 {
    public static void main(String[] args) {
    int[] nums = {-1,0,1,2,-1,-4};

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(j == i)
                {
                    continue;
                }
                else
                {
                    
                for(int k =0;k<nums.length;k++)
                {
                    if(j == k || k == i)
                    {
                        continue;
                    }
                    else
                    {
                        
                        if( (nums[i]+nums[j]+nums[k]) == 0)
                        {
                           System.out.println(i+" "+j+" "+k+"");
                        }
                    
                    }
                }
                }
            }
        }
    }
}
