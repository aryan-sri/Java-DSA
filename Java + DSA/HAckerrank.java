class Hackerank
{
    public static void main(String[] args) 
    {
        String S  = "baab";
        System.out.println(superReducedString(S));
    }
    
    public static String check( String s)
    {
        String res ="";
        String res2 ="";
        for(int i=0;i<s.length()-1;i++)
        {
            char A = s.charAt(i);
            char B = s.charAt(i+1);
            if(A==B)
            {
                res2 = s.substring(i+2,s.length());
                System.out.println("c "+res);
                break;
            }
            else
            {
                res = res+A;
            }

        }
        return (res+res2);
        
    }
    public static String superReducedString(String s) {
    // Write your code here
    int i=0;
    while(i<s.length()-1)
    {
        
        char A = s.charAt(i);
            char B = s.charAt(i+1);
            if(A==B)
            {
                System.out.println("b "+s);
                s = check(s);
                System.out.println("a "+s);
                i=0;
            }
            
            i++;

    }
    System.out.println("f "+s);
    if(s.length()==2)
    {
        if(s.charAt(0) == s.charAt(1))
        {
            s = "";
        }
    }

    return s;
        
    }

}
