public class IBM {
    public static String compressed(String s)
    {
        String ans = "";
        for(int i = 0;i< s.length();i=i+2)
        {
            char c = s.charAt(i);
            if(!ans.contains(c+""))
            {
            int n = Integer.parseInt(s.charAt(i+1)+"");
            
            while(n>0)
            {
                ans = ans+c;
                n--;
            }
        }
        }
        return ans;
    }
    public static void main(String[] args) {
        String inputStr = "a3b5c2a2";
        String compressedResult = compressed(inputStr);
        System.out.println(compressedResult);  // Output: "aaabbbbbcc"
    }

}
