import java.util.*;


public class TCS_q3 {
    public static void main(String[] args) {
        
        Scanner ob = new Scanner(System.in);
        String s = ob.nextLine();
        int cHash =0;
        int cStar = 0;
        for(int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c == '#')
            {
                cHash++;
            }
            else if (c == '*')
            {
                cStar++;
            }
        }
        if(cHash == cStar)
        {
            System.out.println(0);
        }
        else if(cHash > cStar)
        {
            System.out.println(-1);
        }
        else 
        {
            System.out.println(1);
        }
        
    }
}
