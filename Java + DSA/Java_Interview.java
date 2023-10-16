import java.util.*;
public class Java_Interview {
    
    public static boolean isPrime(int n)
    {
        int count=0;
        for(int i =1;i<=n;i++)
        {
            if(n%i ==0)
            {
                count++;
            }
        }

        if(count ==2)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> prime = new ArrayList<>();
        int Sum = 10;
        int Lower_Range = 2;
        int Upper_Range = 10;
        for(int i = Lower_Range;i<Upper_Range;i++ )
        {
            if(isPrime(i))
            {
                prime.add(i);
            }
        }
        
        for(int i =0;i<prime.size();i++)
        {
             for(int j =i;j<prime.size();j++)
             {
                int s = prime.get(i)+prime.get(j);
                
                if(s == Sum)
                {
                System.out.println("(" +prime.get(i)+","+prime.get(j)+")");
                }
             }
        }

    }
}
