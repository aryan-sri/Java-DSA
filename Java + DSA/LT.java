class LT{

public static void main(String[] args) {
    


    int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 2;
    int g= 10;
    for(int i=1;i<=k;i++)
    {
        g = largest(nums,g);
        System.out.println(g);
    }
    
}
public static int largest(int[] nums,int l)
{
    
    int g = -10;
    for(int i =0;i<nums.length;i++)
    {
        if(g<l && nums[i]<l)
        {
          
           
            if(nums[i]>g)
            {
                
            g = nums[i];
            
        }
    }
    }
    
    

    return g;
} 
    
}

