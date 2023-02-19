public class rc_skip_char {
    
    public static void main(String[] args) {
        String a = "aabbvbc";
        System.out.println(Skip_Char(a, 'b', 0, ""));
    }
    public static String Skip_Char(String str , char a , int i , String ans)
    {
        if(str.length() == i)
        {
            return ans;
        }

        if(str.charAt(i) != a)
        {
            ans = ans+str.charAt(i);
        }
        return Skip_Char(str, a, i+1, ans);
    }
}
