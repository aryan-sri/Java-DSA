import java.util.*;
public class TCS_CodeVita
{
    public static boolean perfectSquare(int n)
    {
        double sq = Math.sqrt(n);

        return ((sq - Math.floor(sq))== 0);
    }
    public static boolean SquareFree(int n)
    {
        for(int i =2;i<=n;i++)
        {
             if(n%i ==0)
             {
                 if(perfectSquare(i))
                 {
                    return false;
                 }
             }
        }
        return true;
    }
    public static boolean isPrime(int n)
    {
        int count =0;
        for(int i =1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count == 2)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  N = sc.nextInt(); // 20

       
        int ans =0;
        for(int i =2;i<N;i++)
        {
            if(N%i ==0)
            {
            if(isPrime(i))
            {
                ans++;
                System.out.println(i);
            }
        
        //checking if the factor is square free itself
        
           else if(SquareFree(i))
           {
               ans++;
               System.out.println(i);
           }
        }
        
        }

        System.out.println(ans);
    }
}

