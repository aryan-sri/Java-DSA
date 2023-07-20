public class Factors_Optimised_Approach {
    public static void main(String[] args) {
        int n = 20;
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i ==0)
            {
                 System.out.print(i+ " "+n/i+" ");
            }
        }
        print(5);
    }
    public static void print(int n)
    {
        if(n==1)
        {
            return;
        }
        System.out.println(n);
        print(--n);
        System.out.println(n);
    }
}
