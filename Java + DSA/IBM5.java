public class IBM5 {

    public static int Val(char c)
    {
        if(c == 'L')
        {
            return 50;
        }
        if(c == 'I')
        {
            return 1;
        }
        if(c == 'X')
        {
            return 10;
        }
        if(c == 'V')
        {
            return 5;
        }
        if(c == 'C')
        {
            return 100;
        }
        return 0;
    }
    public static void main(String[] args) {
        String s = "LXXXIV";
        int result = 0;
        int prev =0;
        for(int i = s.length()-1;i>=0;i--)
        {
            int curr = Val(s.charAt(i));
            if(curr< prev)
            {
                result = result - curr;
                
            }
            else
            {
                result = result +curr;
            }
            prev = curr;
        }
        System.out.println(result);
    }
    
}
