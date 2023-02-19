public class LT4 {
    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) 
    {
        int length =0;
        String check = "";
        
        for(int i = 0;i<s.length();i++)
        {
            if(check.indexOf(s.charAt(i))<0)
            {
                check= check+s.charAt(i);
                length = Math.max(length,check.length());
            }
            else
            {
                length = Math.max(length,check.length());
                i = check.indexOf(s.charAt(i));
                check = "";
               
            }
        }
        return length;
        
        
    }
}
