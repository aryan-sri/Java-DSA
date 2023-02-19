public class LT2 {
    public static int longestPalindrome(String s) {
    
        int l = 0;
        String str = "";
            for(int i=0;i<=s.length()-1;i++)
            {
                for(int j=i+1;j<=s.length();j++)
                {
                    str = s.substring(i,j);
                    if(isPalindrome(str))
                    {
                        l++;
                    }
                    
                }
            }
        return l;
    }
    public static boolean isPalindrome(String s)
    {
        String reverse = "";
        for(int i =s.length()-1;i>=0;i--)
        {
            reverse = reverse + s.charAt(i);
        }
        if(reverse.equals(s))
        {
            return true;
        }
        return false;
            
    }
    public static void main(String[] args) {
        
        String s = "";
        System.out.println(longestPalindrome(s));
    }
} 
    

