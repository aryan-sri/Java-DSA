
public class autobiography_no {

    public static void main(String[] args) {

        System.out.println(check("2020"));
        
    }
    public static int check(String s)
    {
        char c = 'I';
        int c1 =0;
        int c2 =0;
        int c3=0;
        int n1  = Integer.parseInt((s.charAt(0)+""));
        int n2  = Integer.parseInt((s.charAt(1)+""));
        for(int i =0;i<s.length();i++)
        {
            int n3 = Integer.parseInt((s.charAt(i)+""));
           
            if(n3 == 0)
            {
                
                c1++;
            }
            else if(n3 == 1)
            {
                c2++;
            }
            else
            {
                c3++;
            }

        }
       
        if(n1==c1 && n2 == c2)
        {
            if(n1 ==0 && n2 == 0)
            {
                return c3;
            }
            else if( (n1 ==1 && n2==0) || (n1== 0 && n2 ==1))
            {
                return c3+1;
            }
            else 
            {
                return c3+1+1;
            }
        }
        else
        {
            return 0;
        }
    }
    
}
