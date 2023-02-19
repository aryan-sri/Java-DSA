class Solution {
    public int numberOfSteps(int num) {
        
        return count(num ,0);
        
    }
    
    public int count(int num , int c)
    {
        if(num ==0)
        {
            return c;
        }
        if(num%2 == 0)
        {
            c=c+1;
            return count(num/2 , c);
        }
         c=c+1;
        return count(num-1 , c);
        
    }
    
    
}